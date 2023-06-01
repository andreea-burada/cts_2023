package ro.ase.csie.cts.design_patterns.observer;

public class UserNotificationModule implements IGameConnectionStatus {
    @Override
    public void connectionUpdate(boolean isConnected) {
        System.out.printf("Connection status has been changed. Current status: %b%n", isConnected);
    }
}
