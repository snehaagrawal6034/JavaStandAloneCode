package SOLID.LiskovSubstitution.fix;


//derived classes must be completely substitutable for their base classes
// extending or inheriting replace it with composition.
public class Square {
    private final Rectangle rectangle = new Rectangle();

    public void setLength(int length) {
        rectangle.setLength(length);
        rectangle.setBreadth(length);
    }

    public int getLength() {
        return rectangle.getBreadth(); // return rectangle.getLength();
    }

    public int getArea() {
        return rectangle.getArea();
    }
}
