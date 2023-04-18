package ro.ase.csie.cts.homework02.factory.main;

import burada.andreea.g1096.factory.*;
import ro.ase.csie.cts.homework02.factory.*;

public class TestFactory {
    public static void main(String[] args) {
        AbstractModuleFactory extraBatteryFactory = new ExtraBatteryFactory();
        AbstractModule extraBattery = extraBatteryFactory.getDroneModule(
                "TATTU R-LINE LiPo" ,
                "LiPo battery for FPV drones, version 3.0.",
                94.99F
        );
        System.out.println(extraBattery.details());

        AbstractModuleFactory highResCameraFactory = new HighResCameraFactory();
        AbstractModule highResCamera = highResCameraFactory.getDroneModule(
                "DJI Inspire 3",
                "Master the Unseen",
                329.99F
        );
        System.out.println(highResCamera.details());

        AbstractModuleFactory gpsTrackingFactory = new GpsTrackingFactory();
        AbstractModule gpsTracking = gpsTrackingFactory.getDroneModule(
                "GPS Auto Qeno® GPS Tracker",
                "Fast and accurate GPS tracker.",
                49.99F
        );
        System.out.println(gpsTracking.details());
        GpsTrackingModule gpsTrackingModule = (GpsTrackingModule) gpsTracking;
        gpsTrackingModule.setAccuracy(95.5F);
        System.out.println(gpsTracking.details());
    }
}
