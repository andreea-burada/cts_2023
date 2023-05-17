package ro.ase.csie.cts.design_patterns.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3D implements IModel3D {
    String modelFile;
    String name;

    public Model3D(String modelFile, String name) {
        System.out.printf("Generating model for %s ...%n", name);

        this.modelFile = modelFile;
        this.name = name;

        Random random = new Random();
        int noPoints = random.nextInt(10000);
        for(int i = 0; i < noPoints; i++) {
            this.points.add(random.nextInt(20000));
        }
    }

    ArrayList<Integer> points = new ArrayList<>();

    @Override
    public String getDescription() {
        return this.name;
    }

    @Override
    public void displayOnScreen(Coordinates coordinates, String color) {
        System.out.printf("Displaying %s ... ", this.name);
        System.out.printf("3D model number of points: %d ... ", this.points.size());
        System.out.printf("Placing object at (%d, %d) ... ", coordinates.getX(), coordinates.getY());
        System.out.printf("Applying texture color %s ...%n", color);
    }
}
