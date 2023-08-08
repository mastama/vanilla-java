package polymorphism;

public class VicePresident extends Manager{
    String name;

    public VicePresident(String name) {
        super(name);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + "," + " My name is VicePresident " + this.name);
    }
}
