package ro.ase.csie.cts.homework02.builder_director.main;

import ro.ase.csie.cts.homework02.builder.Drone;
import ro.ase.csie.cts.homework02.builder_director.DroneBuilderDirector;
import ro.ase.csie.cts.homework02.builder_director.DroneModel;

public class TestBuilderDirector {
    public static void main(String[] args) {
        DroneBuilderDirector droneDirector = new DroneBuilderDirector();

        Drone hobbyDrone = droneDirector.build(DroneModel.HOBBY);
        System.out.println(hobbyDrone.details());

        Drone streamingDrone = droneDirector.build(DroneModel.STREAMING);
        System.out.println(streamingDrone.details());

        Drone newsDrone = droneDirector.build(DroneModel.NEWS);
        System.out.println(newsDrone.details());

        Drone documentaryDrone = droneDirector.build(DroneModel.DOCUMENTARY);
        System.out.println(documentaryDrone.details());
    }
}
