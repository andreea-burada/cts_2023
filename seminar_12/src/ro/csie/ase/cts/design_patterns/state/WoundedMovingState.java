package ro.csie.ase.cts.design_patterns.state;

public class WoundedMovingState implements IMovingState {
    @Override
    public void moveCharacter() {
        System.out.println("Character is limping ...");
    }
}
