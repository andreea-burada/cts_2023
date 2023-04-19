package subject_B5.builder.models;

import subject_B5.IBicycle;

public class Bicycle implements IBicycle {
    private float wheelDiameter;
    private String brakeType;
    private boolean hasHelmet;
    private boolean hasSunGlasses;
    private Bicycle(float wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    @Override
    public void setWheelDiameter(float diameter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setBrakeType(String brakeType) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setHelmet(boolean hasHelmet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setSunGlasses(boolean hasSunGlasses) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void printBicycle() {
        System.out.printf("bicycle - wheel diameter: %.2f cm; brake type: %s; has helmet: %b; has sunglasses: %s;%n",
                this.wheelDiameter,
                !(this.brakeType == null) ? this.brakeType : "none",
                this.hasHelmet,
                this.hasSunGlasses
        );
    }

    @Override
    public void displayModeOfUsage() {
        System.out.printf("bicycle is in %s mode%n", this.hasHelmet ? "safe" : "unsafe");
    }

    public static class BicycleBuilder implements IBicycleBuilder {
        private Bicycle bicycle;
        public BicycleBuilder(float wheelDiameter) {
            bicycle = new Bicycle(wheelDiameter);
        }

        @Override
        public BicycleBuilder addBrakeType(String brakeType) {
            bicycle.brakeType = brakeType;
            return this;
        }

        @Override
        public BicycleBuilder addHelmet() {
            bicycle.hasHelmet = true;
            return this;
        }

        @Override
        public BicycleBuilder addSunglasses() {
            bicycle.hasSunGlasses = false;
            return this;
        }

        public Bicycle build() {
            return this.bicycle;
        }
    }
}
