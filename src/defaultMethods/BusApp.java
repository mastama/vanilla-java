package defaultMethods;

import interfaceInheritance.Motor;

public class BusApp {
    public static void main(String[] args) {

        Motor motor = new Bus();
        System.out.println(motor.getBrand());
        System.out.println(motor.getTire());
        System.out.println(motor.isBig());
        System.out.println(motor.isMainteances());
        motor.drive();
    }
}
