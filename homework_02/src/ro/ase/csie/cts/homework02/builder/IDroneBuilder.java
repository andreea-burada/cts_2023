package ro.ase.csie.cts.homework02.builder;

import ro.ase.csie.cts.homework02.factory.AbstractModule;

public interface IDroneBuilder {
    public DroneBuilder addModel(String model);
    public DroneBuilder addSoftwareVersion(String softwareVersion);
    public DroneBuilder addMaxSpeed(float maxSpeed);
    public DroneBuilder addMaxRange(int maxRange);
    public DroneBuilder addMaxHeight(int maxHeight);
    public DroneBuilder addExtraBattery(AbstractModule extraBattery);
    public DroneBuilder addHighResCamera(AbstractModule highResCamera);
    public DroneBuilder addGpsTracking(AbstractModule gpsTracking);
    public Drone build();
}
