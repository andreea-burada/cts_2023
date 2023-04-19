package subject_B5.factory.factory_method;

import subject_B5.IBicycle;

public interface IBicycleFactory {
    IBicycle getBicycle(
            float wheelDiameter,
            String brakeType,
            boolean hasHelmet,
            boolean hasSunglasses
    );
}
