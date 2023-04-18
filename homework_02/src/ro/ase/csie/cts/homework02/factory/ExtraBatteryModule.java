package ro.ase.csie.cts.homework02.factory;

public class ExtraBatteryModule extends AbstractModule {
    protected int capacity;
    protected boolean hasFastCharging;

    public ExtraBatteryModule(
            String name,
            String description,
            float price) {
        super(name, description, price);
    }

    public ExtraBatteryModule(
            String name,
            String description,
            float price,
            int capacity,
            boolean hasFastCharging
    ) {
        super(name, description, price);
        this.capacity = capacity;
        this.hasFastCharging = hasFastCharging;
    }

    @Override
    public String details() {
        return String.format("Extra Battery module: name - %s; description - %s; price - $%.2f; capacity - %dmAh; has Fast Charging - %b",
                this.name,
                this.description,
                this.price,
                this.capacity,
                this.hasFastCharging
        );
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasFastCharging() {
        return hasFastCharging;
    }

    public void setHasFastCharging(boolean hasFastCharging) {
        this.hasFastCharging = hasFastCharging;
    }
}
