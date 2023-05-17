package ro.ase.csie.cts.design_patterns.decorator;

import ro.ase.csie.cts.design_patterns.adapter.ACMESuperhero;
import ro.ase.csie.cts.design_patterns.adapter.IACMESuperhero;

public class TestDecorator {
    public static void main(String[] args) {
        IACMESuperhero Dexter = new ACMESuperhero("Dexter", 30.5F);
        Dexter.attack("Bubbles");
        Dexter.run();

        System.out.println();

        Dexter = new ACMESuperheroDecoratorWounded(Dexter);
        Dexter.attack("Bubbles");
        Dexter.run();

        System.out.println();

        Dexter = new ACMESuperheroDecoratorWeapon(Dexter, "laser pistol");
        Dexter.attack("Bubbles");
        Dexter.run();

    }
}
