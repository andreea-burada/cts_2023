package ro.ase.csie.cts.design_patterns.composite;

public class NPCEnemy extends AbstractNPCGroupExtended {
    @Override
    public void attack(int points) {
        System.out.printf("Enemy hit character for %d HP ...%n", points);
    }

    @Override
    public void heal(int points) {
        System.out.printf("Enemy is healing for %d HP ...%n", points);
    }

    @Override
    public void move() {
        System.out.println("Enemy is moving ...");
    }

    @Override
    public void addNPC(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNPC(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getNPC(Object object) {
        throw new UnsupportedOperationException();
    }
}
