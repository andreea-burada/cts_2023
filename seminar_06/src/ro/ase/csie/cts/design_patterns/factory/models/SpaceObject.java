package ro.ase.csie.cts.design_patterns.factory.models;

public abstract class SpaceObject {
    private String name;
    public SpaceObject(String name) {
        super();
        this.name = name;
    }
    public abstract void getDescription();
}
