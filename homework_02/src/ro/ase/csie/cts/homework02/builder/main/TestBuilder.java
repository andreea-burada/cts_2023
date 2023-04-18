package ro.ase.csie.cts.homework02.builder.main;

import ro.ase.csie.cts.homework02.builder.Drone;
import ro.ase.csie.cts.homework02.builder.DroneBuilder;
import burada.andreea.g1096.factory.*;
import ro.ase.csie.cts.homework02.factory.*;

public class TestBuilder {
    public static void main(String[] args) {
        ExtraBatteryModule extraBattery = (ExtraBatteryModule) new ExtraBatteryFactory().getDroneModule(
                "EX-tra Large Battery",
                "Extra large battery for modern drones.",
                89.99F
        );
        extraBattery.setCapacity(50000);

        HighResCameraModule highResCamera = (HighResCameraModule) new HighResCameraFactory().getDroneModule(
                "BNX-388 HI-RES Kaemera",
                "Crystal clear pictures and videos",
                199.99F
        );
        highResCamera.setHasFlash(true);
        highResCamera.setResolution(85);

        GpsTrackingModule gpsTracking = (GpsTrackingModule) new GpsTrackingFactory().getDroneModule(
                "JG49KL Ultra Tracker",
                "Best GPS tracker on the market",
                344.49F
        ) ;
        gpsTracking.setAccuracy(99.9F);
        gpsTracking.setMaxRange(1200);

        Drone drone = new DroneBuilder("XH-JS57",
                "3.42v",
                12.5F,
                900,
                120)
                .addExtraBattery(extraBattery)
                .addHighResCamera(highResCamera)
                .addGpsTracking(gpsTracking)
                .build();
        System.out.println(drone.details());
    }
}
