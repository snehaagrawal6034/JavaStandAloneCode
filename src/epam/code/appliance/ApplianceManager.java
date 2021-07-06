package epam.code.appliance;

import java.util.*;

public final class ApplianceManager {

    private final List<Appliance> app = new ArrayList<>();
    private static final Map<String, Appliance> map = new HashMap<>();


    public void addAppliance(Appliance appliance){
        app.add(appliance);
        System.out.println("List value is :" + appliance);
        map.put(appliance.getId(), appliance);
        System.out.println("Map values are :" + map);

    }

    public void setSwitchStatus(String id, boolean switchStatus) {
        if(map.containsKey(id)) {
            map.get(id).setSwitchStatus(switchStatus);
        }
    }

    public int unitConsumed(){
        int unitConsumed = 0;
        for(Appliance appliance : app){
            if (appliance.isSwitchStatus()) {
                unitConsumed = unitConsumed + appliance.getUnitConsumed();
            }
        }
        return unitConsumed;
    }

    public List<Appliance> sortedAppliance() {
        List<Appliance> appliances = new ArrayList<>(map.values());
            appliances.sort(new Comparator<Appliance>() {
                @Override
                public int compare(Appliance o1, Appliance o2) {
                    System.out.println(o1.getUnitConsumed() + " " + o2.getUnitConsumed());
                    return o1.getUnitConsumed() - o2.getUnitConsumed();
                }
            });
        return appliances;
    }
}
