package ro.ase.csie.cts.homework02.prototype.main;

import ro.ase.csie.cts.homework02.prototype.AutonomousDriving;
import ro.ase.csie.cts.homework02.prototype.AutonomousDrivingRegistry;

public class TestPrototype {
    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime;
        // checking if using clone is faster than creating an object
        startTime = System.nanoTime();
        AutonomousDriving autonomousDriving1 = new AutonomousDriving("ver. 1");
        endTime = System.nanoTime();
        System.out.println(String.format("\nTime elapsed for creating object using constructor: %d nanoseconds", endTime - startTime));

        startTime = System.nanoTime();
        AutonomousDriving autonomousDriving2 = (AutonomousDriving) autonomousDriving1.clone();
        endTime = System.nanoTime();
        System.out.println(String.format("Time elapsed for creating object using clone: %d nanoseconds", endTime - startTime));

        System.out.println();

        // checking if the versions are the same and if the clone was done correctly
        System.out.println(autonomousDriving1);
        System.out.println(autonomousDriving2);
        System.out.println(autonomousDriving1 == autonomousDriving2);

        System.out.println();

        // getting versions from the registry
        startTime = System.nanoTime();
        AutonomousDriving autonomousDriving3 = AutonomousDrivingRegistry.getVersion("v1.1");
        endTime = System.nanoTime();
        // the first time it will take longer because the static block of the registry is being run and it includes the creation of 3 AI modules
        System.out.println(String.format("\nTime elapsed for getting object from prototype registry the first time: %d nanoseconds", endTime - startTime));

        startTime = System.nanoTime();
        AutonomousDriving autonomousDriving4 = AutonomousDrivingRegistry.getVersion("v1.1");
        endTime = System.nanoTime();
        System.out.println(String.format("Time elapsed for getting object from prototype registry the second time: %d nanoseconds", endTime - startTime));

        System.out.println();

        System.out.println(autonomousDriving3);
        // check if objects are the same or not
        System.out.println(autonomousDriving3 == autonomousDriving4);
    }
}
