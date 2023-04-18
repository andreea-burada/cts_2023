package ro.ase.csie.cts.homework02.singleton_registry;

import java.util.HashMap;

// 2. In the backend, you need to handle the connection to different microservices REST API, like users’ service, drones service, manufacturing service.
// Each service has a unique name and an associated URL, based on the AbstractMicroService class. Also, each service accepts only one connection
// from each client. Implement a class that will handle the microservices unique connections, by extending AbstractMicroService.
public class MicroService extends AbstractMicroService {
    private static final HashMap<String, MicroService> microServices = new HashMap<>();

    private MicroService(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public static MicroService connect(String url, String name) {
        if (!microServices.containsKey(name)) {
            microServices.put(name, new MicroService(url, name));
        }
        return microServices.get(name);
    }

    public static void disconnect(String name) {
        microServices.remove(name);
    }

    @Override
    public String getDescription() {
        return String.format("URL - %s; MicroService Name - %s;", this.url, this.name);
    }

    // for testing purposes
    public static void displayAllMicroServices() {
        microServices.forEach((key, microService) -> System.out.println(microService.getDescription()));
    }
}
