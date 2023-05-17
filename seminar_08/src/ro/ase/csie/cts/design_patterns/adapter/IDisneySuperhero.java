package ro.ase.csie.cts.design_patterns.adapter;

public interface IDisneySuperhero {
    public float getLifePoints();
    public String getDescription();
    public void moveOnScreen(float distance);
    public void interact(String target);
}
