package ro.ase.csie.cts.design_patterns.decorator;

import ro.ase.csie.cts.design_patterns.adapter.IACMESuperhero;

public class ACMESuperheroDecoratorWeapon extends ACMESuperheroDecorator {
    String weapon;

    public ACMESuperheroDecoratorWeapon(
            IACMESuperhero objectToDecorate,
            String weapon
    ) {
        super(objectToDecorate);
        this.weapon = weapon;
    }

    @Override
    public void attack(String enemy) {
        //super.attack(enemy); // previous version
        System.out.printf("%s attacked %s with %s ...%n",
                this.objectToDecorate.getName(),
                enemy,
                this.weapon
        );
    }
}
