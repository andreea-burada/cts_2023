package subject_B5.factory.main;

import subject_B5.IBicycle;
import subject_B5.factory.factory_method.BicycleElectricFactory;
import subject_B5.factory.factory_method.BicycleMTBFactory;
import subject_B5.factory.factory_method.BicycleTrekkingFactory;

public class Test {
    public static void main(String[] args) {
        IBicycle electric = new BicycleElectricFactory().getBicycle(7.8F, "Safe", true, false);
        electric.printBicycle();
        electric.displayModeOfUsage();

        IBicycle trekking = new BicycleTrekkingFactory().getBicycle(11.2F, "Dangerous", false, true);
        trekking.printBicycle();
        trekking.displayModeOfUsage();

        IBicycle MTB = new BicycleMTBFactory().getBicycle(8.9F, "Medium", true, true);
        MTB.printBicycle();
        MTB.displayModeOfUsage();

        IBicycle trekking2 = new BicycleTrekkingFactory().getBicycle(12.0F, "Extra Safe", false, false);
        trekking2.printBicycle();
        trekking2.displayModeOfUsage();

        System.out.println(trekking.getClass().equals(trekking2.getClass()));
    }
}
