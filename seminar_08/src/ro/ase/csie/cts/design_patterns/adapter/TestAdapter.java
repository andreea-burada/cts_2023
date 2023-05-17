package ro.ase.csie.cts.design_patterns.adapter;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        ArrayList<IACMESuperhero> heroes = new ArrayList<>();

        heroes.add(new ACMESuperhero("Johnny Bravo", 999));
        heroes.add(new ACMESuperhero("Popeye", 50));

        for(IACMESuperhero hero : heroes) {
            hero.attack("Mojo Jojo");
        }

        System.out.println();

        IDisneySuperhero bucsa = new Bucsa(9999);

        DisneyToACMEObjectAdapter bucsaAdapter = new DisneyToACMEObjectAdapter(bucsa);
        heroes.add(bucsaAdapter);

        for(IACMESuperhero hero : heroes) {
            hero.attack("Mojo Jojo");
        }
    }
}
