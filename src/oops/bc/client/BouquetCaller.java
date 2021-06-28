package oops.bc.client;

import oops.bc.Bouquet;
import oops.bc.Flower;
import oops.bc.FlowerFactory;

public class BouquetCaller {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(FlowerFactory.getFlower("Rose"));
        bouquet.addFlower(FlowerFactory.getFlower("Rose"));
        bouquet.addFlower(FlowerFactory.getFlower("Rose"));
        bouquet.addFlower(FlowerFactory.getFlower("Rose"));
        bouquet.addFlower(FlowerFactory.getFlower("Lily"));
        System.out.println(bouquet.cost());
    }
}
