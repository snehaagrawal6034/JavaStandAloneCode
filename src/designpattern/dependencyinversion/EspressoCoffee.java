package designpattern.dependencyinversion;

// High level module and it depends on basic coffee
public class EspressoCoffee implements PremiumCoffee {
    private Coffee basicCoffee;
//    private BasicCoffee basicCoffee; -- old way not good if we change the BasicCoffee implementation

    public EspressoCoffee(Coffee basicCoffee) {
        this.basicCoffee = basicCoffee;
    }

    @Override
    public void prepareExpresso() {
        basicCoffee.prepareFilterCoffee();
        System.out.println("adding cream");
    }
}
