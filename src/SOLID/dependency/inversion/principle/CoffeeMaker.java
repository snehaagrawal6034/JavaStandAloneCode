package SOLID.dependency.inversion.principle;


//The principle of dependency inversion refers to the decoupling of software modules.
//This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.

//Here coffee maker is high-level and it is not depending on low level(BigFilter and ThinFilter) rather on Filter interface
public class CoffeeMaker {
    private Filter bigFilter;

    public CoffeeMaker(Filter filter) {
        this.bigFilter = filter;
    }

    public void makeCoffee() {
        // steps
        bigFilter.filter();
        // steps
    }
}
