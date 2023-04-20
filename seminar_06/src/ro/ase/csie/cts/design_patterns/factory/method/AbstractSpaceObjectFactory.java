package ro.ase.csie.cts.design_patterns.factory.method;

import ro.ase.csie.cts.design_patterns.factory.models.SpaceObject;

public interface AbstractSpaceObjectFactory {
    public SpaceObject getSpaceObject(String name);
}
