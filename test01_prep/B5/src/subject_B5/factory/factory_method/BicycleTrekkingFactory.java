package subject_B5.factory.factory_method;

import subject_B5.IBicycle;
import subject_B5.factory.models.BicycleMTB;
import subject_B5.factory.models.BicycleTrekking;

public class BicycleTrekkingFactory implements IBicycleFactory {
    private static final String DEFAULT_BRAND = "Bianchi";
    @Override
    public IBicycle getBicycle(float wheelDiameter, String brakeType, boolean hasHelmet, boolean hasSunglasses) {
        BicycleTrekking product = new BicycleTrekking();
        product.setWheelDiameter(wheelDiameter);
        product.setBrakeType(brakeType);
        product.setHelmet(hasHelmet);
        product.setSunGlasses(hasSunglasses);
        product.setBrand(DEFAULT_BRAND);
        return product;
    }
}
