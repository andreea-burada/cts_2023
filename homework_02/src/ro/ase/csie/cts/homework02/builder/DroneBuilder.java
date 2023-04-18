package ro.ase.csie.cts.homework02.builder;

import ro.ase.csie.cts.homework02.factory.AbstractModule;

// 4. In the end, the Drone class will handle all drone details. Add more attributes to it (at least 4-5) and implement a mechanism that
// will allow other developers to create efficiently a drone with any combination of modules/attributes, without the possibility of
// changing it later (once the drone is created, the manufacture process starts, and you can’t change it)
public class DroneBuilder implements IDroneBuilder {
    private Drone drone;

    // used by the builder director
    public DroneBuilder() {
        this.drone = new Drone();
    }

    // these attributes I considered mandatory and thus are included in the constructor
    public DroneBuilder(
            String model,
            String softwareVersion,
            float maxSpeed,
            int maxRange,
            int maxHeight
    ) {
        this.drone = new Drone();
        drone.setModel(model);
        drone.setSoftwareVersion(softwareVersion);
        drone.setMaxSpeed(maxSpeed);
        drone.setMaxRange(maxRange);
        drone.setMaxHeight(maxHeight);
    }

    @Override
    public DroneBuilder addModel(String model) {
        drone.setModel(model);
        return this;
    }

    @Override
    public DroneBuilder addSoftwareVersion(String softwareVersion) {
        drone.setSoftwareVersion(softwareVersion);
        return this;
    }

    @Override
    public DroneBuilder addMaxSpeed(float maxSpeed) {
        drone.setMaxSpeed(maxSpeed);
        return this;
    }

    @Override
    public DroneBuilder addMaxRange(int maxRange) {
        drone.setMaxRange(maxRange);
        return this;
    }

    @Override
    public DroneBuilder addMaxHeight(int maxHeight) {
        drone.setMaxHeight(maxHeight);
        return this;
    }

    @Override
    public DroneBuilder addExtraBattery(AbstractModule extraBattery) {
        drone.setExtraBattery(extraBattery);
        return this;
    }

    @Override
    public DroneBuilder addHighResCamera(AbstractModule highResCamera) {
        drone.setHighResCamera(highResCamera);
        return this;
    }

    @Override
    public DroneBuilder addGpsTracking(AbstractModule gpsTracking) {
        drone.setGpsTracking(gpsTracking);
        return this;
    }

    @Override
    public Drone build() {
        return drone;
    }
}
