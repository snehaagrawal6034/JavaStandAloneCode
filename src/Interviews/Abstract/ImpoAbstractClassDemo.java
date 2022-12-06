package Interviews.Abstract;

// abstract class - member variables allowed, non-abstract methods, one class can extend only 1 abstract subclass.
// interface - default functions, one class can implement multiple interfaces
// object creation for both - anonymous inner class or concrete subclass object.
// anonymous inner class is also a subclass of interface or abstract class.
// After having default and static methods inside the interface, we think about the need for abstract classes in Java .
// ----An interface and an abstract class are almost similar except that you can create a constructor in the abstract class
// -----(which can be instantiated by anonymous inner class) whereas you can't do this in an interface.

public abstract class ImpoAbstractClassDemo {
    private  int b;
    public ImpoAbstractClassDemo(int b) {
        this.b = b;
    }
    public ImpoAbstractClassDemo() {}
    void a() {
    }

    abstract void b();

    public static void main(String[] args) {

        ImpoAbstractClassDemo abstractClassDemo = new ImpoAbstractClassDemo(1) {
            @Override
            void b() {
                System.out.println("I am anonymous");
            }
        };
        abstractClassDemo.b();
    }
}