package java8.Exercises;

import java.util.*;
public class JavaStreamExample4 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        // max() method to get max Product price
        float productAPrice = productsList.stream()
                .max(Comparator.comparing(product -> product.price))
                .map(product -> product.price)
                .get();

        // o1-o2
        System.out.println(productAPrice);
        // min() method to get min Product price

        // >=0 pick first agument, otherwise second
        Optional<Product> productB = productsList.stream()
                .max((lastComputed, nextProduct)->{
                    System.out.println("lastcomputed:" + lastComputed + "nextproduct:" + nextProduct);
                            return lastComputed.id - nextProduct.id;
                        });

        System.out.println(productB.get().price);



    }
}
