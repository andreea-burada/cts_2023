package ro.csie.ase.cts.design_patterns.command;

public class UpdateService {
    public void doUpdate(String serverIP) {
        System.out.printf("Updating content for IP %s ...%n", serverIP);
    }
}
