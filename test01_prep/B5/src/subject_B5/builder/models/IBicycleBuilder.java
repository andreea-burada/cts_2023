package subject_B5.builder.models;

import subject_B5.IBicycle;

public interface IBicycleBuilder {
    IBicycleBuilder addBrakeType(String brakeType);
    IBicycleBuilder addHelmet();
    IBicycleBuilder addSunglasses();
}
