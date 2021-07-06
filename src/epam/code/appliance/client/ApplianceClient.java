package epam.code.appliance.client;

import epam.code.appliance.ApplianceFactory;
import epam.code.appliance.ApplianceManager;

public class ApplianceClient {

    public static void main(String[] args) {
        ApplianceManager am = new ApplianceManager();
        am.addAppliance(ApplianceFactory.getAppliance("Fan","f1"));
        am.addAppliance(ApplianceFactory.getAppliance("Laptop","l30"));
        am.addAppliance(ApplianceFactory.getAppliance("Laptop","l2"));


        am.setSwitchStatus("f1", true);
        am.setSwitchStatus("l30", false);
        am.setSwitchStatus("l20", true);

        System.out.println(am.unitConsumed());
        System.out.println("Sorted by unitsConsumed : " + am.sortedAppliance());
    }
}
