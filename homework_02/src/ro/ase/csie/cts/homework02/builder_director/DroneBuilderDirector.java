package ro.ase.csie.cts.homework02.builder_director;

import ro.ase.csie.cts.homework02.builder.Drone;
import ro.ase.csie.cts.homework02.builder.DroneBuilder;
import ro.ase.csie.cts.homework02.factory.ExtraBatteryFactory;
import ro.ase.csie.cts.homework02.factory.GpsTrackingFactory;
import ro.ase.csie.cts.homework02.factory.HighResCameraFactory;

// 5. Several drone models are more frequently requested than others. To facilitate the creation of those particular types,
// implement a catalogue of predefined drones models (with at least 3 types) that will help other developers to instantiate them fast and simple.
public class DroneBuilderDirector {
    private DroneBuilder builder;

    public DroneBuilderDirector() {
    }

    public Drone build(DroneModel model) {
        return switch (model) {
            case HOBBY -> buildHobbyDrone();
            case STREAMING -> buildStreamingDrone();
            case NEWS -> buildNewsDrone();
            case DOCUMENTARY -> buildDocumentaryDrone();
            default -> throw new IllegalArgumentException("Unsupported drone model.");
        };
    }

    private Drone buildHobbyDrone() {
        builder = new DroneBuilder(
                "Generic Hobby Drone",
                "1.0.0v",
                9.5F,
                550,
                50
        );
        return builder
                .addGpsTracking(new GpsTrackingFactory().getDroneModule("Generic GPS Tracker", "GPS Tracker for Hobbists", 39.99F))
                .build();
    }

    private Drone buildStreamingDrone() {
        builder = new DroneBuilder(
                "Generic Streaming Drone",
                "1.1.0v",
                8.5F,
                2500,
                85
        );
        return builder
                .addExtraBattery(new ExtraBatteryFactory().getDroneModule("High Cap Battery", "Large battery that lasts up to 48h", 349.99F))
                .addHighResCamera(new HighResCameraFactory().getDroneModule("4K Sony Camera", "Ultra high resolution 120fps camera for streaming", 599.99F))
                .build();
    }

    private Drone buildNewsDrone() {
        builder = new DroneBuilder(
                "Generic News Drone",
                "1.2.0v",
                15F,
                5500,
                120
        );
        return builder
                .addExtraBattery(new ExtraBatteryFactory().getDroneModule("X-High Cap Battery", "Large battery that lasts up to 72h", 549.99F))
                .addHighResCamera(new HighResCameraFactory().getDroneModule("8K Sony Camera", "Ultra high resolution 240fps camera for news broadcasting", 1199.99F))
                .addGpsTracking(new GpsTrackingFactory().getDroneModule("High Tech GPS Tracker", "GPS Tracker for professionals", 249.99F))
                .build();
    }

    private Drone buildDocumentaryDrone() {
        builder = new DroneBuilder(
                "Generic Documentary Drone",
                "1.3.0v",
                9.75F,
                7250,
                100
        );
        return builder
                .addExtraBattery(new ExtraBatteryFactory().getDroneModule("Long-Lasting Battery", "Large battery that lasts up to 60h", 429.99F))
                .addHighResCamera(new HighResCameraFactory().getDroneModule("Ultra Resolution High-Def Camera", "Ultra high resolution 144fps camera for quality video footage", 749.99F))
                .build();
    }
}
