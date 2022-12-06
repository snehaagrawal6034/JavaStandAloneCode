package TryCatch;

import java.io.Closeable;

public class TryDemoWithBothFinallyAndResources {

    public static void main(String[] args) {
//        CustomStream customStream = new CustomStream();
//        try {
//            customStream.doSomething();
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            customStream.close();
//        }
        try(CustomStream customStream = new CustomStream()) {
            customStream.doSomething();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static class CustomStream implements Closeable {

        public void doSomething() {
            throw new RuntimeException("some exception");
        }

        @Override
        public void close() {
            System.out.println("close called");
        }
    }
}
