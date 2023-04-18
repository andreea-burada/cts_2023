package ro.ase.csie.cts.homework02.builder;

import ro.ase.csie.cts.homework02.factory.AbstractModule;

public class Drone {

    private String model;
    private String softwareVersion;
    private float maxSpeed;
    private AbstractModule extraBattery;

    //add at least 4-5 new attributes of your choice. At least 2 must be AbstractModule.
    private int maxRange;
    private int maxHeight;
    private AbstractModule highResCamera;
    private AbstractModule gpsTracking;

    protected Drone() {
    }

    public String details() {
        return String.format("""
                        Drone details:
                        model - %s; software ver. - %s; max. speed - %.2f KM/h; max. range - %dm; max. height - %dm;
                        modules:
                        \t- extra battery module: %s
                        \t- high res. camera module: %s
                        \t- GPS tracking module: %s
                        """,
                model,
                softwareVersion,
                maxSpeed,
                maxRange,
                maxHeight,
                extraBattery != null ? extraBattery.details() : "no extra battery module",
                highResCamera != null ? highResCamera.details() : "no high resolution camera module",
                gpsTracking != null ?  gpsTracking.details() : "no GPS tracking module"
        );
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    protected void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    protected void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public AbstractModule getExtraBattery() {
        return extraBattery;
    }

    protected void setExtraBattery(AbstractModule extraBattery) {
        this.extraBattery = extraBattery;
    }

    public int getMaxRange() {
        return maxRange;
    }

    protected void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    protected void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public AbstractModule getHighResCamera() {
        return highResCamera;
    }

    protected void setHighResCamera(AbstractModule highResCamera) {
        this.highResCamera = highResCamera;
    }

    public AbstractModule getGpsTracking() {
        return gpsTracking;
    }

    protected void setGpsTracking(AbstractModule gpsTracking) {
        this.gpsTracking = gpsTracking;
    }
}
