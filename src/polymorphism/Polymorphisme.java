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
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
