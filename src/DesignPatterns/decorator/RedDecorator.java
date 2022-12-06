package DesignPatterns.decorator;

public class RedDecorator implements Shape {
    private Shape shape;

    public RedDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return "red " + shape.draw();
    }

    @Override
    public String toString() {
        return "RedDecorator " + shape.toString();
    }
}
