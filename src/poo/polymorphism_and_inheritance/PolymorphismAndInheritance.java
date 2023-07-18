package poo.polymorphism_and_inheritance;
import java.util.ArrayList;

// Herencia y polimorfismo van prácticamente de la mano, se refiere a que varios objetos o entidades pueden
// tener comportamientos o atributos iguales, podríamos definir por ejemplo una clase animal, animal el cual
// se puede desplazar, puede comer, etc. pero a la vez cada uno hacer la acción de diferente manera y
// a su vez pueden heredar de "animal" pueden tener los mismos atributos, ya sea nombre, tipo, etc.
// para no hacer tan complejo el código solo definiremos la acción "mover"

public class PolymorphismAndInheritance {

    // Mas abajo se encuentran definidas las clases
    public static void main(String[] args) {

        // Creamos 3 animales uno de cada tipo definido
        Dog dog = new Dog();
        Snake snake = new Snake();
        Fish fish = new Fish();

        // Definimos una lista de animales
        ArrayList<Animal> animals = new ArrayList<>();

        // Añadimos cada animal a la lista
        animals.add(dog);
        animals.add(snake);
        animals.add(fish);

        // Iteramos por la lista de animales utilizando la misma función para cada animal
        for (Animal animal : animals) {
            animal.move();
        }

        // Si nos damos cuenta cada animal nos dice una cosa diferente utilizando la misma función
    }
}

// Clase principal
class Animal {
    void move() {
    }
}

// Definimos las clases que heredan de la clase Animal
class Dog extends Animal {
    void move() {
        System.out.println("The dog is walking...");
    }
}
class Snake extends  Animal {
    void move() {
        System.out.println("The snake is slithering...");
    }
}

class Fish extends Animal {
    void move() {
        System.out.println("The fish is swimming...");
    }
}
