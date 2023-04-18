package ro.ase.csie.cts.homework02.factory;

public class ExtraBatteryFactory implements AbstractModuleFactory {
    private static final int DEFAULT_CAPACITY = 3000;
    private static final boolean DEFAULT_HAS_FAST_CHARGING = true;
    @Override
    public AbstractModule getDroneModule(String name, String description, float price) {
        return new ExtraBatteryModule(name, description, price, DEFAULT_CAPACITY, DEFAULT_HAS_FAST_CHARGING);
    }
}
