package ro.ase.csie.cts.design_patterns.observer;

import java.util.concurrent.TimeUnit;

public class AutoReconnectModule implements IGameConnectionStatus {
    @Override
    public void connectionUpdate(boolean isConnected) {
        try {
            if (!isConnected) {
                System.out.println("Reconnecting in 10 seconds ...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Reconnecting now ...");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
