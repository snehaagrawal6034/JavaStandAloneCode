package java8.functionalinterface;

public class CustomFunctionTest {

    public static void main(String[] args) {
//        CustomFunction customFunction = new CustomFunction() {
//            @Override
//            public void call() {
//                System.out.println("calling");
//            }
//        };
        CustomFunction customFunction = () -> System.out.println("calling");
    }
}
