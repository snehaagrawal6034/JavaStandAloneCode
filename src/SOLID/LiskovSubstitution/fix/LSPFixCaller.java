package SOLID.LiskovSubstitution.fix;

public class LSPFixCaller {
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(10);
        System.out.println(square.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(10);
        rectangle.setLength(20);
        System.out.println(rectangle.getArea());
    }
}
