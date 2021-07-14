package java8.lambda.stat.ref;

public class RunnableUsingLambda {

    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("running thread using lambda"));
        t.run();

//    Above is equivalent to
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running thread using classic inner class style");
            }
        });
        th.run();

        Thread t2 = new Thread(RunnableUsingLambda::ThreadStatus);
        t2.start();
    }
}
