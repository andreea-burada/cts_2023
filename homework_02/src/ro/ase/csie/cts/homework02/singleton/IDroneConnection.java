package ro.ase.csie.cts.homework02.singleton;
public interface IDroneConnection {
	public abstract void connect();
	public abstract boolean isConnected();
	public abstract void disconnect();
}
