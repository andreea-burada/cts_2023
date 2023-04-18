package ro.ase.csie.cts.homework02.prototype;

import java.util.HashMap;
import java.util.Map;

// 7. As there are different versions (at least 2 or 3) of the AI module implement a solution that will allow developers to create fast copies of them.
public class AutonomousDrivingRegistry {
    private static final Map<String, AutonomousDriving> versions = new HashMap<>();

    static {
        // loading 3 default versions of the AI
        System.out.println("Loading first 3 initial AI versions ...");

        try {
            AutonomousDriving autonomousDrivingV0 = new AutonomousDriving("v1.0");
            AutonomousDriving autonomousDrivingV1 = new AutonomousDriving("v1.1");
            AutonomousDriving autonomousDrivingV2 = new AutonomousDriving("v1.2");

            versions.put(autonomousDrivingV0.getVersion(), autonomousDrivingV0);
            versions.put(autonomousDrivingV1.getVersion(), autonomousDrivingV1);
            versions.put(autonomousDrivingV2.getVersion(), autonomousDrivingV2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static AutonomousDriving getVersion(String version) {
        AutonomousDriving versionCopy = null;
        AutonomousDriving versionOriginal = versions.get(version);
        if (versionOriginal != null)
            versionCopy = (AutonomousDriving) versionOriginal.clone();
        return versionCopy;
    }

    public static void addVersion(AutonomousDriving newVersion) {
        versions.put(newVersion.getVersion(), newVersion);
    }
}
