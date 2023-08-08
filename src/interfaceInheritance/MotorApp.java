package interfaceInheritance;

public class MotorApp {
    public static void main(String[] args) {

        Motor motor = new Nmax();
        motor.drive();
        System.out.println(motor.getBrand());
        System.out.println(motor.isMainteances());;
        System.out.println(motor.getTire());
    }
}
