package ro.ase.csie.cts.homework02.prototype;

// 6. You work on an AI module that will be installed on drones to allow them to be autonomous. The class that handles the AI module is AutonomousDriving.
// In the testing phase many instances of the same version of AI module are created. The current implementation requires a lot of time to instantiate AI entities.
// Implement a solution that will solve this problem, allowing developers to create fast new AI modules entities.
public class AutonomousDriving implements Cloneable {
    String version;

    public AutonomousDriving(String version) throws InterruptedException {
        this.version = version;
        System.out.println("Start AI module....");
        Thread.sleep(5000);
        System.out.println("Init AI module....learning done");
    }

    @Override
    public Object clone() {
        AutonomousDriving clone = null;
        try {
            clone = (AutonomousDriving) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "AutonomousDriving{" +
                "version='" + version + '\'' +
                '}';
    }

    public String getVersion() {
        return version;
    }
}
