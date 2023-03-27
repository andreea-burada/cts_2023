package ro.ase.csie.cts.design_patterns.singleton.registry;

import java.util.HashMap;

public class DBConnectionsRegistry implements IDBConnection {
    private String ip;
    private static HashMap<String, DBConnectionsRegistry> connections = new HashMap<>();
    private DBConnectionsRegistry(String ip) {
        this.ip = ip;
    }

    public static DBConnectionsRegistry getConnection(String ip) {
        if (!connections.containsKey(ip)) {
            connections.put(ip, new DBConnectionsRegistry(ip));
        }
        return connections.get(ip);
    }
    @Override
    public void connect() {

    }

    @Override
    public void query() {

    }
}
