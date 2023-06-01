package ro.csie.ase.cts.design_patterns.state;

public class TestState {
    public static void main(String[] args) {
        Superhero superhero = new Superhero("Batman");
        superhero.move();

        superhero.isHit(60);
        superhero.move();

        superhero.heal(40);
        superhero.move();
    }
}
