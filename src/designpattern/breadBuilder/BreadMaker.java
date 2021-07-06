package designpattern.breadBuilder;

public class BreadMaker {
    public static void main(String[] args) {
        BreadComposition milkBread = new BreadComposition.Builder()
                .setHeight(1)
                .setWidth(1)
                .setMilkBread(true)
                .build();

        BreadComposition nonMilkBread = new BreadComposition.Builder()
                .setHeight(1)
                .setWidth(1)
                .setMilkBread(false)
                .build();
    }
}
