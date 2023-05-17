package ro.ase.csie.cts.design_patterns.flyweight;

public class TestFlyweight {
    public static void main(String[] args) {
        IModel3D meteor1 = Model3DRegistry.getModel("meteor");
        IModel3D meteor2 = Model3DRegistry.getModel("meteor");
        IModel3D meteor3 = Model3DRegistry.getModel("meteor");

        System.out.println(meteor1 == meteor2);

        meteor1.displayOnScreen(new Coordinates(34, 21), "grey");
        meteor1.displayOnScreen(new Coordinates(11, 56), "black");
        meteor1.displayOnScreen(new Coordinates(42, 75), "gold");
    }
}
