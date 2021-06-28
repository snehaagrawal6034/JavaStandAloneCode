package oops.appliance.client;

import oops.appliance.*;

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
