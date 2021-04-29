package java8;

public class RunnableUsingLambda {

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("running thread using lambda"));
        t.run();
    }

//    Above is equivalent to

//    public static void main(String[] args) {
//
//        Thread th = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running thread using classic inner class style");
//            }
//        });
//                th.run();
//    }

}
