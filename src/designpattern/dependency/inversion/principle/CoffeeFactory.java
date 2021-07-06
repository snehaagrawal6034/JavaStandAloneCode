package designpattern.dependency.inversion.principle;

import epam.code.appliance.Appliance;

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
