package ro.ase.csie.cts.homework02.factory;

public class GpsTrackingFactory implements AbstractModuleFactory {
    private static final int DEFAULT_MAX_RANGE = 1500;
    private static final float DEFAULT_ACCURACY = 85.5F;
    @Override
    public AbstractModule getDroneModule(String name, String description, float price) {
        return new GpsTrackingModule(name, description, price, DEFAULT_MAX_RANGE, DEFAULT_ACCURACY);
    }
}
