package oops.appliance.factory;

public class ApplianceFactory {

    public static Appliance getAppliance(String applianceName, String id) {
        int unitConsumed = -1;
        if (applianceName.equals("Fan")) {
            unitConsumed = 1;
        } else if (applianceName.equals("Tv")) {
            unitConsumed = 2;
        } else if (applianceName.equals("Laptop")) {
            unitConsumed = 3;
        } else {
            return null;
        }
        return new Appliance(id, unitConsumed);
    }
}