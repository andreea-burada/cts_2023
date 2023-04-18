package ro.ase.csie.cts.homework02.factory;

public interface AbstractModuleFactory {
    public AbstractModule getDroneModule(
            String name,
            String description,
            float price
    );
}
