package DesignPatterns.decorator_old;

public class WholeWheatPizza implements Pizza {
    @Override
    public String pizza() {
        return "Whole wheat pizza base";
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
