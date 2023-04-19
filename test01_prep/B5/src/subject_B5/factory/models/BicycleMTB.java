package subject_B5.factory.models;

import subject_B5.IBicycle;

public class BicycleMTB implements IBicycle {
    private float wheelDiameter;
    private String brakeType;
    private boolean hasHelmet;
    private boolean hasSunGlasses;
    private int noGears;

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

    public void setNoGears(int noGears) {
        this.noGears = noGears;
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
        return "BicycleMTB{" +
                "wheelDiameter=" + wheelDiameter +
                ", brakeType='" + brakeType + '\'' +
                ", hasHelmet=" + hasHelmet +
                ", hasSunGlasses=" + hasSunGlasses +
                ", noGears=" + noGears +
                '}';
    }
}
