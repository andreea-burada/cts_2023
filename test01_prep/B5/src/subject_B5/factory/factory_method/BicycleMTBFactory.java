package subject_B5.factory.factory_method;

import subject_B5.IBicycle;
import subject_B5.factory.models.BicycleMTB;

public class BicycleMTBFactory implements IBicycleFactory {
    private static final int DEFAULT_NO_GEARS = 8;
    @Override
    public IBicycle getBicycle(float wheelDiameter, String brakeType, boolean hasHelmet, boolean hasSunglasses) {
        BicycleMTB product = new BicycleMTB();
        product.setWheelDiameter(wheelDiameter);
        product.setBrakeType(brakeType);
        product.setHelmet(hasHelmet);
        product.setSunGlasses(hasSunglasses);
        product.setNoGears(DEFAULT_NO_GEARS);
        return product;
    }
}
