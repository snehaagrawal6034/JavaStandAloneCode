package SOLID.dependency.inversion.principle;

public class BigFilter implements Filter {

    public void filter() {
        System.out.println("filtering the coffee with 0.2mm filter");
    }
}
