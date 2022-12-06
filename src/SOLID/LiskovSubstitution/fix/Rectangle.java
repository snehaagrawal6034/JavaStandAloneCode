package SOLID.LiskovSubstitution.fix;

public class Rectangle {

    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        if(this.length <=0 || this.breadth <=0) {
            throw new IllegalArgumentException("incorrect length or breadth");
        }
        return this.length * this.breadth;
    }
}
