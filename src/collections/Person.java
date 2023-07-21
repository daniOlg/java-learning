package collections;

public class Person {
    private String name;
    private int age;

    // Methods
    public String toString() {
        return name + " is " + age + " years old";
    }

    // Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}