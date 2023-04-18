package ro.ase.csie.cts.homework02.singleton.main;

import ro.ase.csie.cts.homework02.singleton.DroneConnection;

public class TestSingleton {
    public static void main(String[] args) {
        DroneConnection droneConnection = DroneConnection.getDroneConnection();
        System.out.println("drone 1 connection: " + droneConnection.isConnected());

        droneConnection.connect();
        DroneConnection droneConnection2 = DroneConnection.getDroneConnection();
        System.out.println("drone 1 connection: " + droneConnection.isConnected());
        System.out.println("drone 2 connection: " + droneConnection2.isConnected());

        droneConnection.disconnect();
        System.out.println("drone 1 connection: " + droneConnection.isConnected());
    }
}
