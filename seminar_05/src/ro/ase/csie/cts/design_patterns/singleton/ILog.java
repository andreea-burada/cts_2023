package ro.ase.csie.cts.design_patterns.singleton;

public interface ILog {
    public abstract void Error(String message);
    public abstract void Debug(String message);
    public abstract void Info(String message);
}
