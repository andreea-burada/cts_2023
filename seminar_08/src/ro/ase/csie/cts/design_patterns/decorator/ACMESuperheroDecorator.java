package ro.ase.csie.cts.design_patterns.decorator;

import ro.ase.csie.cts.design_patterns.adapter.IACMESuperhero;

public abstract class ACMESuperheroDecorator implements IACMESuperhero {
    // reference to the object we want to decorate
    IACMESuperhero objectToDecorate;

    public ACMESuperheroDecorator(IACMESuperhero objectToDecorate) {
        this.objectToDecorate = objectToDecorate;
    }

    @Override
    public void walk() {
        this.objectToDecorate.walk();
    }

    @Override
    public void run() {
        this.objectToDecorate.run();
    }

    @Override
    public void jump() {
        this.objectToDecorate.jump();
    }

    @Override
    public void attack(String enemy) {
        this.objectToDecorate.attack(enemy);
    }

    @Override
    public String getName() {
        return this.objectToDecorate.getName();
    }
}
