package ro.ase.csie.cts.design_patterns.factory.models;

public class Planet extends SpaceObject {
    private String type;
    public Planet(String name, String type) {
        super(name);
        this.type = type;
    }
    @Override
    public void getDescription() {
        System.out.println("description - a planet");
    }
}
