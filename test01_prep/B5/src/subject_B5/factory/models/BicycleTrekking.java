package subject_B5.factory.models;

import subject_B5.IBicycle;

public class BicycleTrekking implements IBicycle {
    private float wheelDiameter;
    private String brakeType;
    private boolean hasHelmet;
    private boolean hasSunGlasses;
    private String brand;
    
    @Override
    public void setWheelDiameter(float diameter) {
        this.wheelDiameter = diameter;
    }

    @Override
    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    @Override
    public void setHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void setSunGlasses(boolean hasSunGlasses) {
        this.hasSunGlasses = hasSunGlasses;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void printBicycle() {
        System.out.println(this);
    }

    @Override
    public void displayModeOfUsage() {
        System.out.printf("bicycle is in %s mode%n", this.hasHelmet ? "safe" : "unsafe");
    }

    @Override
    public String toString() {
        return "BicycleTrekking{" +
                "wheelDiameter=" + wheelDiameter +
                ", brakeType='" + brakeType + '\'' +
                ", hasHelmet=" + hasHelmet +
                ", hasSunGlasses=" + hasSunGlasses +
                ", brand='" + brand + '\'' +
                '}';
    }
}
