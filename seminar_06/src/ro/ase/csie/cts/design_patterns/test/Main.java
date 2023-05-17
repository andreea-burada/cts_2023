package ro.ase.csie.cts.design_patterns.test;

import ro.ase.csie.cts.design_patterns.factory.method.PlanetFactory;
import ro.ase.csie.cts.design_patterns.factory.method.StarFactory;
import ro.ase.csie.cts.design_patterns.factory.models.Planet;
import ro.ase.csie.cts.design_patterns.factory.models.SpaceObject;
import ro.ase.csie.cts.design_patterns.factory.models.Star;
import ro.ase.csie.cts.design_patterns.factory.simple.SimpleSpaceObjectFactory;
import ro.ase.csie.cts.design_patterns.factory.simple.SpaceObjectType;

public class Main {
    public static void main(String[] args) {
        SpaceObject theSun = new Star("The Sun", 120.5F, 45.3F);
        SpaceObject theEarth = new Planet("The Earth", "habitable");

        // using factory method classes
        theSun = new StarFactory().getSpaceObject("The Sun");
        theEarth = new PlanetFactory().getSpaceObject("The Earth");

        // using simple factory class
        theSun = SimpleSpaceObjectFactory.getSpaceObject(SpaceObjectType.STAR, "The Sun");
        theEarth = SimpleSpaceObjectFactory.getSpaceObject(SpaceObjectType.PLANET, "The Earth");

        theSun.getDescription();
        theEarth.getDescription();
    }
}
