package ro.csie.ase.cts.design_patterns.command;

public class BackgroundUpdateTask implements IBackgroundTask {
    private int hoursInterval;
    private String serverIP;
    UpdateService service;

    public BackgroundUpdateTask(int hoursInterval, String serverIP, UpdateService service) {
        this.hoursInterval = hoursInterval;
        this.serverIP = serverIP;
        this.service = service;
    }

    @Override
    public void doTask() {
        this.service.doUpdate(this.serverIP);
    }
}
