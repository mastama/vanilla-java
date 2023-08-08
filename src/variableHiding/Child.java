package variableHiding;

public class Child extends Parent {
    String name;

    void doit() {
        System.out.println("Do it from Child");

        //menggunakna super untuk mengakses field pada parentClass
        System.out.println("Parent name is " + super.name);
    }
}
