package polymorphism;

public class Manager extends Employee{

    String name;

    public Manager(String name) {
        super(name);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + "," + " My name is Manager " + this.name);
    }
}
