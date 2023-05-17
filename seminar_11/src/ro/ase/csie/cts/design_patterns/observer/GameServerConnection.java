package ro.ase.csie.cts.design_patterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class GameServerConnection {
    private ArrayList<IGameConnectionStatus> connectionHandlers = new ArrayList<>();

    public void registerConnectionHandler(IGameConnectionStatus handler) {
        this.connectionHandlers.add(handler);
    }

    public void unregisterConnectionHandler(IGameConnectionStatus handler) {
        this.connectionHandlers.remove(handler);
    }

    // event starter - the function which will trigger the events
    public void connectionStatusChanged() {
        // generate a random status and notify observers
        Random random = new Random();
        boolean isConnected = random.nextBoolean();
        for(IGameConnectionStatus handler : connectionHandlers) {
            handler.connectionUpdate(isConnected);
        }
    }
}
