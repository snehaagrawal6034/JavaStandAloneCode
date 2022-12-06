package SOLID.dependency.inversion.principle;

public class ThinFilter implements Filter{

    public void filter() {
        System.out.println("filtering the coffee with 0.1mm filter");
    }
}
