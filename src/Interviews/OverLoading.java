package Interviews;
// Java program to demonstrate the Method
// Overloading without super keyword

class GFG {

    // Method m1 with 0 parameter.
    public void m1()
    {
        System.out.println("No parameter method");
    }

    // Method m1 with 1 integer parameter.
    public int m1(int i,Double d)
    {

        System.out.println("Int Parameter");
        return 1;
    }

    public int m1(Double i,Double d)
    {
        System.out.println("Double Parameter");
        return 1;
    }

    // Method m1 with 1 string parameter.
    public String m1(String s)
    {
        System.out.println("String Parameter");
        return "a";
    }
}

// Main Class
public class OverLoading {

    public static void main(String[] args)
    {
        // Creating object for GFG class.
        // g is object of GFG class.
        GFG g = new GFG();

        // Here, m1 called with string parameter.
        // m1(String s) method will be called.
        g.m1(1,1.0);
    }
}

