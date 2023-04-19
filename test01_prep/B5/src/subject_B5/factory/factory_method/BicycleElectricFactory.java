package subject_B5.factory.factory_method;

import subject_B5.IBicycle;
import subject_B5.factory.models.BicycleElectric;

public class BicycleElectricFactory implements IBicycleFactory {
    private static final int DEFAULT_BATTERY_LIFE = 240;
    @Override
    public IBicycle getBicycle(float wheelDiameter, String brakeType, boolean hasHelmet, boolean hasSunglasses) {
        BicycleElectric product = new BicycleElectric();
        product.setWheelDiameter(wheelDiameter);
        product.setBrakeType(brakeType);
        product.setHelmet(hasHelmet);
        product.setSunGlasses(hasSunglasses);
        product.setBatteryLife(DEFAULT_BATTERY_LIFE);
        return product;
    }
}
