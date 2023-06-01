package ro.csie.ase.cts.design_patterns.state;

public class Superhero {
    public static final int MAX_LIFEPOINTS = 100;
    private String name;
    private int lifePoints = 100;
    private IMovingState movingState = new NormalMovingState();

    public Superhero(String name) {
        this.name = name;
    }

    public void move() {
        // this would be the approach without state design pattern
//        if (this.lifePoints == Superhero.MAX_LIFEPOINTS) {
//            System.out.printf("%s is running ...", this.name);
//        } else if ( ... ) {
//            ...
//        } etc.

        this.movingState.moveCharacter();
    }

    public void isHit(int lifePoints) {
        this.lifePoints -= lifePoints;
        this.checkState();
    }

    public void heal(int lifePoints) {
        this.lifePoints += lifePoints;
        this.checkState();
    }

    private void checkState() {
        if(this.lifePoints < MAX_LIFEPOINTS / 2) {
            this.movingState = new WoundedMovingState();
        } else {
            this.movingState = new NormalMovingState();
        }
    }
}
