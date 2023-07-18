package poo.abstraction;

// La abstracción es más que nada poder representar los objetos y entidades de la
// vida real en código, por ejemplo una persona, un auto, una mascota, etc.
public class Abstraction {
    public static void main(String[] args) {
        Person person = new Person();
        person.talk();
        person.walk();
        person.eat();
        person.sleep();
    }
}

class Person {
    String name;
    String gender;
    String nationality;
    int age;

    void talk() {
        System.out.println("hello my brother!");
    }

    void walk() {
        System.out.println("walking...");
        // Logic of walk()
    }

    void eat() {
        System.out.println("eating...");
        // Logic of eat()
    }

    void sleep() {
        System.out.println("sleeping...");
        // Logic of sleep()
    }
}