package DesignPatterns.breadBuilder;

// pattern to create object without using object onstructor
// 1. we can select optional parameters(as many required)
// 2. multiple input is of same datatype, in normal case confusion with Builder it is explicit

public class BreadMaker {
    public static void main(String[] args) {

        BreadComposition milkBread = new BreadComposition.Builder()
                .setHeight(1)
                .setWidth(1)
                .setMilkBread(true)
                .setServings(2)
                .setCalories(7)
                .setHeight(2)
                .build();
        System.out.println(milkBread);
        System.out.println(milkBread.getHeight());

        BreadComposition nonMilkBread = new BreadComposition.Builder()
                .setHeight(1)
                .setWidth(1)
                .setMilkBread(false)
                .setServings(8)
                .build();
        System.out.println(nonMilkBread);
    }
}
