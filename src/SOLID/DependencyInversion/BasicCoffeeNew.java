package SOLID.DependencyInversion;

public class BasicCoffeeNew implements Coffee {
    @Override
    public void prepareFilterCoffee() {
        System.out.println("something");
    }
}
