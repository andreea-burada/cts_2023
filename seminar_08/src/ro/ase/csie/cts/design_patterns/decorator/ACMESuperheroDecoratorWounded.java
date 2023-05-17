package ro.ase.csie.cts.design_patterns.decorator;

import ro.ase.csie.cts.design_patterns.adapter.IACMESuperhero;

public class ACMESuperheroDecoratorWounded extends ACMESuperheroDecorator {
    public ACMESuperheroDecoratorWounded(IACMESuperhero objectToDecorate) {
        super(objectToDecorate);
    }

    @Override
    public void run() {
        // instead of running he will walk
        super.walk();
        System.out.println("Wounded, cannot run ...");
    }
}
