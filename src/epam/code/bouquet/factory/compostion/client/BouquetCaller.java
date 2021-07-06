package epam.code.bouquet.factory.compostion.client;

import epam.code.bouquet.factory.compostion.Bouquet;
import epam.code.bouquet.factory.compostion.FlowerFactory;

public class BouquetCaller {
FlowerFactory ff;

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
//        bouquet.addFlower(FlowerFactory.getFlower("ROSE"));
//        bouquet.addFlower(FlowerFactory.getFlower("LILY"));
//        bouquet.addFlower(FlowerFactory.getFlower("LILY"));
//        bouquet.addFlower(FlowerFactory.getFlower("ROSE"));
//        bouquet.addFlower(FlowerFactory.getFlower("ROSE"));

        bouquet.addFlower(FlowerFactory.getFLower("Rose"));
        bouquet.addFlower(FlowerFactory.getFLower("Lily"));

        System.out.println(bouquet.cost());
    }
}
