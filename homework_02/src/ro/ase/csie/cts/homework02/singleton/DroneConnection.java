package ro.ase.csie.cts.homework02.singleton;

// 1. The drone connection module must allow other developers to connect to the device, but only one unique connection must be created.
//  The connection entity must implement the IDroneConnection interface. Implement the DroneConnection module so developers will
//  not be able to create more than one connection.
public class DroneConnection implements IDroneConnection {
    private String clientIP;
    private static DroneConnection droneConnection;

    private DroneConnection() {
    }

    public static DroneConnection getDroneConnection() {
        if (droneConnection == null)
            droneConnection = new DroneConnection();
        return droneConnection;
    }

    @Override
    public void connect() {
        droneConnection.clientIP = "192.0.0.1";
    }

    @Override
    public boolean isConnected() {
        return !(droneConnection.clientIP == null);
    }

    @Override
    public void disconnect() {
        droneConnection.clientIP = null;
    }
}
