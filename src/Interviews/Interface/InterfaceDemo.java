package Interviews.Interface;

@FunctionalInterface
public interface InterfaceDemo {
    default void a() {
        System.out.println("Sds");
    }
    void b();
}
