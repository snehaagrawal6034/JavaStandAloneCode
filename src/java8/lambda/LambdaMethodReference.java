package java8.lambda;

public class LambdaMethodReference {

    public static void main(String[] args) {
//        one way to print
        Thread t1 = new Thread(() -> printMessage());
        t1.start();

        Thread t2 = new Thread(() -> printMessage());
        t2.start();

//        another way using method references
        Thread t3 = new Thread(LambdaMethodReference :: printMessage);
        t3.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
