import ro.ase.csie.cts.design_patterns.singleton.registry.DBConnectionsRegistry;
import ro.ase.csie.cts.design_patterns.singleton.registry.IDBConnection;

public class TestRegistry {
    public static void main(String[] args) {
        IDBConnection testDB = DBConnectionsRegistry.getConnection("192.168.0.1");
        IDBConnection testDB1 = DBConnectionsRegistry.getConnection("192.168.0.1");
        System.out.println(testDB == testDB1);
    }
}
