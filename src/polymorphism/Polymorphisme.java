package polymorphism;

public class Polymorphisme {
    /**
     * polymorphisme = perubahan bentuk dari satu object ke object yang lain
     * berkaitan erat dengan inheritance
     */
    public static void main(String[] args) {

        Employee employee = new Employee("Tama");
        employee.sayHello("Joko");

        employee = new Manager("Singgih");
        employee.sayHello("Daniel");

        employee = new VicePresident("Pratama");
        employee.sayHello("Prama");

        //contoh lain penggunaan polymorphism
        sayHello(new Employee(employee.name));
        sayHello(new Manager(employee.name));
        sayHello(new VicePresident(employee.name));

        sayHello(new Employee("Singgih"));
        sayHello(new Manager("Pratama"));
        sayHello(new VicePresident("Mas Tama"));

        System.out.println("==================================================");
        sayHellosWithKonversiDanPengecekan(new Employee("Tama"));
        sayHellosWithKonversiDanPengecekan(new Manager("Singgih"));
        sayHellosWithKonversiDanPengecekan(new VicePresident("Pratama"));

    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }

    /**
     * proses pengecekan dan konversi
     */
    static void sayHellosWithKonversiDanPengecekan(Employee employee) {
        if (employee instanceof VicePresident vicePresident) {
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager manager) {
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
