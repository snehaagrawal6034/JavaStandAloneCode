package java8;

public interface DefaultInterface {
    String adsds = "fsdfd";

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("this method is default"  + adsds);
    }
}
