package ro.ase.csie.cts.design_patterns.adapter;

public interface IACMESuperhero {
    public void walk();
    public void run();
    public void jump();
    public void attack(String enemy);
    public String getName();
}
