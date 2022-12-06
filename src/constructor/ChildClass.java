package constructor;

public class ChildClass extends SuperClass {

    public ChildClass() {
        super(13);
        System.out.println("I am default child");
    }

    public ChildClass(int a ) {
        super(13);
        System.out.println("I am parameterized child");
    }

    public  void printVal(){
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        SuperClass childClass1 = new ChildClass();
        SuperClass childClass2 = new ChildClass(9);
        childClass1.printVal();
        childClass2.printVal();
    }
}
