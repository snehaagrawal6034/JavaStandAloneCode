package oops.appliance.factory;

public class Appliance {

    private final String id;
    private boolean switchStatus;
    private final int unitConsumed;

    public Appliance(String id, int unitConsumed) {
        this.id = id;
        this.unitConsumed = unitConsumed;
    }

    public boolean isSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(boolean switchStatus) {
        this.switchStatus = switchStatus;
    }

    public int getUnitConsumed() {
        return unitConsumed;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "id='" + id + '\'' +
                ", switchStatus=" + switchStatus +
                ", unitConsumed=" + unitConsumed +
                '}';
    }
}