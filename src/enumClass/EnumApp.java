package enumClass;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Pratama");
        customer.setLevel(Level.VIP.getDescription());

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        //parsing enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        //menampilkan semua value yang ada pada enum "Level"
        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
