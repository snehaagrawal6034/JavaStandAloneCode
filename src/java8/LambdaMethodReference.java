package java8;

public class LambdaMethodReference {

    public static void main(String[] args) {
//        one way to print
        Thread t = new Thread(() -> printMessage());
        t.start();

//        another way using method references
        Thread t2 = new Thread(LambdaMethodReference :: printMessage);
        t2.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
