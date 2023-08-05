package oop;

public class PersonApp {

    public static void main(String[] args) {
        // menggunakan constructor tanpa paramater
        Person person = new Person();
        person.firstName = "Singgih";
        person.lastName = "Pratama";

        person.sayHello("Farah");

        // menggunakan constructor dengan 2 paramater
        Person person1 = new Person(person.firstName, person.lastName);
        person1.sayHello("Rizkia");

        // menggunakan constructor dengan 1 parameter
        Person person2 = new Person(person1.firstName);
        person2.lastName = "jancok";
        person2.sayHello("Ananda");
    }
}
