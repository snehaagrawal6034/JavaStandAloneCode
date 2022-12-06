package SOLID.dependency.inversion.principle;

public class CoffeeFactory {

        public static Filter filter(String filterType) {

            if (filterType.equals("BigFilter")) {
                return new BigFilter();
            } else if (filterType.equals("ThinFilter")) {
                return new ThinFilter();
            } else {
                return null;
            }
        }
    }
