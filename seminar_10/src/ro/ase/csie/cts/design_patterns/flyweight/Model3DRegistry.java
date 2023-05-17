package ro.ase.csie.cts.design_patterns.flyweight;

import java.util.HashMap;

public class Model3DRegistry {
    static HashMap<String, IModel3D>  models = new HashMap<>();

    // eager approach to generate the models
    static {
        models.put("meteor", new Model3D("Meteor.3d", "meteor"));
        models.put("planet", new Model3D("Planet.3d", "planet"));
        models.put("spacedust", new Model3D("Space_Dust.3d", "space dust"));
    }

    public static IModel3D getModel(String modelKey) {
        return models.get(modelKey.toLowerCase().trim());
    }
}
