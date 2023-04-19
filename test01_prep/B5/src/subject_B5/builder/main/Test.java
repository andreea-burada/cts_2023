package subject_B5.builder.main;

import subject_B5.IBicycle;
import subject_B5.builder.models.Bicycle;

public class Test {
    public static void main(String[] args) {
        try {
            IBicycle bicycle1 = new Bicycle.BicycleBuilder(12.4F)
                    .addBrakeType("Ultra Safe")
                    .addHelmet()
                    .build();
            bicycle1.printBicycle();
            bicycle1.displayModeOfUsage();


            IBicycle bicycle2 = new Bicycle.BicycleBuilder(9.5F)
                    .addBrakeType("Moderately Safe")
                    .addSunglasses()
                    .build();
            bicycle2.printBicycle();

            IBicycle bicycle3 = new Bicycle.BicycleBuilder(13.1F)
                    .addHelmet()
                    .addSunglasses()
                    .build();
            bicycle3.printBicycle();

            IBicycle bicycle4 = new Bicycle.BicycleBuilder(14.4F)
                    .addBrakeType("Dangerous")
                    .addSunglasses()
                    .build();
            bicycle4.printBicycle();
            bicycle4.displayModeOfUsage();

            // setters are implemented so that they do not modify the attributes
            bicycle1.setSunGlasses(true);

        } catch (Exception e) {
            System.out.println("!Do not try to modify a bicycle!");
        }
    }
}
