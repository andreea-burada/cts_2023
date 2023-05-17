package ro.ase.csie.cts.design_patterns.factory.models;

public class Star extends SpaceObject {
    private float size;
    private float age;
    public Star(String name, float size, float age) {
        super(name);
        this.size = size;
        this.age = age;
    }

    @Override
    public void getDescription() {
        System.out.println("description - a star");
    }
}
