package ro.ase.csie.cts.design_patterns.adapter;

public class ACMESuperhero implements IACMESuperhero {
    String name;
    float hitPoints;

    public ACMESuperhero(String name, float hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    @Override
    public void walk() {
        System.out.println("Superhero is walking ...");
    }

    @Override
    public void run() {
        System.out.println("Superhero is running ...");
    }

    @Override
    public void jump() {
        System.out.println("Superhero jumped ...");
    }

    @Override
    public void attack(String enemy) {
        System.out.printf("Superhero attacked %s ...%n", enemy);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
