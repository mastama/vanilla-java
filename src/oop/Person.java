package oop;

public class Person {

    String firstName;
    String lastName;

    /**
     * constructor overloading
     * @param firstName
     * @param lastName
     */

    // constructor dengan 2 parameter
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // constructor dengan 1 parameter
    public Person(String firstName) {
        this.firstName = firstName;
    }

    // constructor tanpa parameter
    public Person() {

    }

    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + " My name is " + this.firstName + " " + lastName);
    }
}
