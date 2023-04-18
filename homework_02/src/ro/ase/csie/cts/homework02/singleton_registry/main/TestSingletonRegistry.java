package ro.ase.csie.cts.homework02.singleton_registry.main;

import ro.ase.csie.cts.homework02.singleton_registry.MicroService;

public class TestSingletonRegistry {
    public static void main(String[] args) {
        MicroService microService1 = MicroService.connect("http://localhost:8080/API", "backend API");
        System.out.println(microService1.getDescription());

        MicroService microService2 = MicroService.connect("https://facebook.com/DronePage", "Facebook Drone Page");
        System.out.println(microService2.getDescription());

        // check if objects are the same
        MicroService microService3 = MicroService.connect("https://facebook.com/DronePage", "Facebook Drone Page");
        System.out.println(microService2 == microService3);

        System.out.println();
        MicroService.displayAllMicroServices();

        System.out.println();
        MicroService.disconnect("backend API");
        MicroService.displayAllMicroServices();
    }
}
