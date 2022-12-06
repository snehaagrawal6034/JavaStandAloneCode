package DesignPatterns.decorator_old;

//https://stackoverflow.com/questions/6366385/use-cases-and-examples-of-gof-decorator-pattern-for-io
// https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/#:~:text=The%20decorator%20design%20pattern%20uses,the%20class%20methods'%20signature%20unchanged

//1. Decorator design pattern is useful in providing runtime modification abilities and hence more flexible. Its easy to maintain and extend when the amount of choices are more.
//2. The disadvantage of decorator design pattern is that it uses plenty of similar kind of objects (decorators)
//3. Decorator pattern is used a lot in Java IO classes, like FileReader, BufferedReader, etc.

public interface Pizza {

    String pizza();

    double cost();

    public static void main(String[] args) {
        Pizza pizza = new WholeWheatPizza();
        Pizza pizza2 = new RefinedFlourPizza();
        System.out.println(ToppingsClass.addTomato(ToppingsClass.addOnion(pizza)));
    }
}
