package java8.Exercises;

import java.util.*;
import java.util.stream.Collectors;
class JavaStreamExample2 {
    int id;
    String name;
    float price;
    public JavaStreamExample2(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class JavaStreamExample1 {
    public static void main(String[] args) {
        List<JavaStreamExample2> productsList = new ArrayList<JavaStreamExample2>();
        //Adding Products
        productsList.add(new JavaStreamExample2(1,"HP Laptop",25000f));
        productsList.add(new JavaStreamExample2(2,"Dell Laptop",30000f));
        productsList.add(new JavaStreamExample2(3,"Lenevo Laptop",28000f));
        productsList.add(new JavaStreamExample2(4,"Sony Laptop",28000f));
        productsList.add(new JavaStreamExample2(5,"Apple Laptop",90000f));
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 20000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
    }
}
