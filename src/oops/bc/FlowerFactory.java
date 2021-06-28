package oops.bc;

public class FlowerFactory {

    public static Flower getFlower(String flowerName) {
        if (flowerName.equalsIgnoreCase("Rose")) {
            return new Flower(1, "Rose");
        } else if (flowerName.equalsIgnoreCase("Lily")) {
            return new Flower(2, "Lily");
        }
        return null;
    }
}
