package Interviews;

class GFG2 {

    // Method m1 with 0 parameter.
    public void m1()
    {
        System.out.println("No parameter method");
    }
}

// tech class extends class GFG
// Using Inheritance concept.
class tech extends GFG {
    int a;
    public tech (int a){
        this.a = 10;
        System.out.println(a);
    }

    public tech() {

    }

    // Method m1 with 0 parameter.
    public void m1()
    {
        System.out.println("Single Int Parameter");

        // Using super keyword to call
        // m1 method from class GFG.
        super.m1();
    }
}

// Main Class
public class OverridingDemo {
    public static void main(String[] args)
    {
        // Creating object for tech class
        // obj is the object for tech class.
        tech obj = new tech(1);
        GFG objq = new tech();

        // tech class method m1
        // will be called here.
        // tech class extends GFG class

        // GFG class method m1 will be
        // called inside tech class method m1.

        // both method m1 will be called
        // one from tech class and
        // second from GFG class.
        obj.m1();
        objq.m1();
    }
}

