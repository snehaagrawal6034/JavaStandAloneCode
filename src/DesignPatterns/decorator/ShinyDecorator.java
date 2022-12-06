package DesignPatterns.decorator;

public class ShinyDecorator implements Shape {

    private Shape shape;

    public ShinyDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return "shiny " + shape.draw();
    }

    @Override
    public String toString() {
        return "ShinyDecorator " + shape.toString();
    }
}
