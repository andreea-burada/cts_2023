package ro.ase.csie.cts.design_patterns.factory.simple;

import ro.ase.csie.cts.design_patterns.factory.models.Planet;
import ro.ase.csie.cts.design_patterns.factory.models.SpaceObject;
import ro.ase.csie.cts.design_patterns.factory.models.Star;

public class SimpleSpaceObjectFactory {
    public static SpaceObject getSpaceObject(
            SpaceObjectType type,
            String name
    ) {
        switch (type) {
            case STAR -> {
                return new Star(name, 0.0F, 0.0F);
            }
            case PLANET -> {
                return new Planet(name, "unknown");
            }
            default -> {
                throw new UnsupportedOperationException();
            }
        }
    }
}
