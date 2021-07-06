package epam.code.bouquet.factory.compostion;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FlowerFactory {

    //    public static Flower getFlower(String flowerName){
//        if(flowerName.equals("ROSE")) {
//            return new Flower(2, "ROSE");
//        }
//         else if(flowerName.equals("LILY")){
//            return new Flower(1, "LILY");
//        }
//        return null;
//    }
    public static final Supplier<Flower> ROSE = new Supplier<Flower>()
    {
        @Override
        public Flower get () {
            return new Flower(1, "ROSE");
        }
    };

    public static final Supplier<Flower> LILY = () -> new Flower(2, "LILY");

    private static final Map<String, Supplier<Flower>> MAP = new HashMap<>();
    // when to use final vs non-final java
    // static vs non static.

    static{ // static initializer
        MAP.put("Rose",ROSE);
        MAP.put("Lily",LILY);
    }


    public static Flower getFLower(String flowerName){
        return MAP.get(flowerName).get();
    }

}
