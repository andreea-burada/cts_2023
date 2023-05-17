package ro.ase.csie.cts.design_patterns.observer;

public class TestObserver {
    public static void main(String[] args) {
        GameServerConnection gameServerConnection = new GameServerConnection();
        UserNotificationModule uiNotifications = new UserNotificationModule();
        AutoSaveModule autoSave = new AutoSaveModule();
        AutoReconnectModule autoReconnect = new AutoReconnectModule();

        gameServerConnection.registerConnectionHandler(uiNotifications);
        gameServerConnection.registerConnectionHandler(autoSave);
        gameServerConnection.registerConnectionHandler(autoReconnect);
        gameServerConnection.connectionStatusChanged();

        System.out.println();

        gameServerConnection.unregisterConnectionHandler(autoSave);
        gameServerConnection.connectionStatusChanged();

        System.out.println();

        // fast hack for test
        // in order to be able to unregister it, store the anonymous class in a variable
//        IGameConnectionStatus anonymousHandler = new IGameConnectionStatus() {
//            @Override
//            public void connectionUpdate(boolean isConnected) {
//                System.out.printf("I am an anonymous observer. My status is %b%n", isConnected);
//            }
//        };
//        gameServerConnection.registerConnectionHandler(anonymousHandler);
//        gameServerConnection.connectionStatusChanged();
//        gameServerConnection.unregisterConnectionHandler(anonymousHandler);

        gameServerConnection.registerConnectionHandler(new IGameConnectionStatus() {
            @Override
            public void connectionUpdate(boolean isConnected) {
                System.out.printf("I am an anonymous observer. My status is %b%n", isConnected);
            }
        });
        gameServerConnection.connectionStatusChanged();
    }
}
