package abstractClass;

public class AbstarctApp {
    public static void main(String[] args) {

        /**
         * Abstract class tidak bisa di new instance object
         */
        //Location location = new Location();

        City city = new City();
        city.name = "Pratama";
        System.out.println(city.name);
    }
}
