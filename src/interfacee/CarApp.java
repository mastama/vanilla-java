package interfacee;

public class CarApp {

    public static void main(String[] args) {

        //menggunakna konsep polymorphisme
        Car car = new Yamaha();
        car.drive();
        System.out.println(car.tire());;
    }
}
