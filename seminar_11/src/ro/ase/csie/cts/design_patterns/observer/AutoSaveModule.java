package ro.ase.csie.cts.design_patterns.observer;

public class AutoSaveModule implements IGameConnectionStatus {
    @Override
    public void connectionUpdate(boolean isConnected) {
        if(!isConnected) {
            System.out.println("Saving game data ...");
        }
    }
}
