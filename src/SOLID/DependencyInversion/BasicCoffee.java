package SOLID.DependencyInversion;

public class BasicCoffee implements Coffee {
    @Override
    public void prepareFilterCoffee() {
        System.out.println("boiling water");

        System.out.println("adding  milk");
        System.out.println("adding coffee");
    }
}
