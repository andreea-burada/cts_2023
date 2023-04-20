package ro.ase.csie.cts.design_patterns.factory.method;

import ro.ase.csie.cts.design_patterns.factory.models.SpaceObject;
import ro.ase.csie.cts.design_patterns.factory.models.Star;

public class StarFactory implements AbstractSpaceObjectFactory {
    @Override
    public SpaceObject getSpaceObject(String name) {
        return new Star(name, 0.0F, 0.0F);
    }
}
