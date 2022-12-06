package oops.appliance.factory.client;

import oops.appliance.factory.ApplianceFactory;
import oops.appliance.factory.ApplianceManager;

public class ApplianceClient {

        public static void main(String[] args) {
            ApplianceManager am = new ApplianceManager();
            am.addAppliance(ApplianceFactory.getAppliance("Fan","f1"));
            am.addAppliance(ApplianceFactory.getAppliance("Laptop","l2"));
            am.addAppliance(ApplianceFactory.getAppliance("Laptop","l3"));

            am.setSwitchStatus("f1", true);
            System.out.println(am.unitConsumed());
            System.out.println(am.sortedAppliance());
        }
    }
