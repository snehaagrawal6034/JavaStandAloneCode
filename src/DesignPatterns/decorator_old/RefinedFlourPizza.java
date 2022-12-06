package DesignPatterns.decorator_old;

// wheat pizza + tomato (0.30) + onion (0.40) + cheese(0.50)
// whole wheat + tomato + cheese
// refined pizaa + cheese
// refined pizza
public class RefinedFlourPizza implements Pizza {
    @Override
    public String pizza() {
        return "Refined flour pizza";
    }

    @Override
    public double cost() {
        return 0.40;
    }
}
