package ro.ase.csie.cts.design_patterns.adapter;

public class Bucsa implements IDisneySuperhero {
    float lifePoints;

    public Bucsa(float lifePoints) {
        this.lifePoints = lifePoints;
    }

    @Override
    public float getLifePoints() {
        return this.lifePoints;
    }

    @Override
    public String getDescription() {
        return "Bucșă!";
    }

    @Override
    public void moveOnScreen(float distance) {
        System.out.printf("Bucșă is moving %.2f meters ...%n", distance);
    }

    @Override
    public void interact(String target) {
        System.out.printf("Bucșă is interacting with %s ...", target);
    }
}
