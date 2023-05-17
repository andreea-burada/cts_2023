package ro.ase.csie.cts.design_patterns.composite;

public class NPCGroup extends AbstractNPCGroupExtended {
    @Override
    public void attack(int points) {
        for(Object item : this.group) {
            ((AbstractNPCGroupExtended) item).attack(points);
        }
    }

    @Override
    public void heal(int points) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException();
    }
}
