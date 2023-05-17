package ro.ase.csie.cts.design_patterns.adapter;

public class DisneyToACMEObjectAdapter implements IACMESuperhero {
    // reference to an object of the class *we want to adapt*
    IDisneySuperhero disneyHero;

    // always ask for the reference in the constructor
    public DisneyToACMEObjectAdapter(IDisneySuperhero disneyHero) {
        this.disneyHero = disneyHero;
    }

    @Override
    public void walk() {
        this.disneyHero.moveOnScreen(115.5F);
    }

    @Override
    public void run() {
        this.disneyHero.moveOnScreen(60.5F);
    }

    @Override
    public void jump() {
        // clean implementation because the Disney hero has nothing close to a jump method
        System.out.printf("%s jumped ...%n", this.disneyHero.getDescription());
    }

    @Override
    public void attack(String enemy) {
        this.disneyHero.interact(enemy);
    }

    @Override
    public String getName() {
        return this.disneyHero.getDescription();
    }
}
