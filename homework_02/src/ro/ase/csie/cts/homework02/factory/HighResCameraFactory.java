package ro.ase.csie.cts.homework02.factory;

public class HighResCameraFactory implements AbstractModuleFactory {
    private static final int DEFAULT_RESOLUTION = 55;
    private static final boolean DEFAULT_HAS_FLASH = false;
    @Override
    public AbstractModule getDroneModule(String name, String description, float price) {
        return new HighResCameraModule(name, description, price, DEFAULT_RESOLUTION, DEFAULT_HAS_FLASH);
    }
}
