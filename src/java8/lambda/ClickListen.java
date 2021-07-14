package java8.lambda;

@FunctionalInterface
interface ClickListen {
        String onClick(String abc, String xyz);
        default void arbit() {
            System.out.println("i ma here");
        }
    }
