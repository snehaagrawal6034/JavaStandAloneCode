package constructor;

public class ChildClass extends SuperClass {

    public ChildClass() {
        super(13);
        System.out.println("I am child");
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

    }
}
