package java8.lambda.stat.ref;

public class MethodReference {
    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(MethodReference::ThreadStatus);
        t2.start();


        //classic way
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MethodReference.ThreadStatus();
            }
        });
        t1.start();
    }

}
