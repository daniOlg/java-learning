package collections;

import java.util.ArrayList;
import java.util.LinkedList;

// Se puede recorrer como un arreglo, puede tener datos duplicados
public class Lists {
    public static void main(String[] args) {

        // ARRAY LIST -> Va creciendo conforme se añaden objetos
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("John", 34));
        arrayList.add(new Person("Leny", 23));
        arrayList.add(new Person("Henry", 49));
        arrayList.add(new Person("Francis", 61));
        arrayList.add(new Person("Leny", 80));
        System.out.println("Array List: " + arrayList);

        // LINKED LIST -> Doblemente enlazada a través de punteros
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("John", 34));
        linkedList.add(new Person("Leny", 23));
        linkedList.add(new Person("Henry", 49));
        linkedList.add(new Person("Francis", 61));
        linkedList.add(new Person("Leny", 80));
    }
}
