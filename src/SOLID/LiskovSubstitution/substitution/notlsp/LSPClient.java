package SOLID.LiskovSubstitution.substitution.notlsp;

public class LSPClient {

    public static void main(String[] args) {
        Rectangle r = new Square();
        r.setLength(20);
        r.setBreadth(10);
        System.out.println(r.getArea());

        Rectangle r1 = new Rectangle();
        r1.setLength(20);
        r1.setBreadth(10);
        System.out.println(r1.getArea());
    }
}
