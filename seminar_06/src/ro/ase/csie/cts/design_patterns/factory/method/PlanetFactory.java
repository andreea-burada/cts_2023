package ro.ase.csie.cts.design_patterns.factory.method;

import ro.ase.csie.cts.design_patterns.factory.models.Planet;
import ro.ase.csie.cts.design_patterns.factory.models.SpaceObject;

public class PlanetFactory implements AbstractSpaceObjectFactory {
    @Override
    public SpaceObject getSpaceObject(String name) {
        return new Planet(name, "unknown");
    }
}
