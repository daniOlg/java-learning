package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    // Los sets no permiten valores duplicados
    public static void main(String[] args) {
        // HASH SET -> Rinde mejor con más datos, porque no los ordena
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("John", 34));
        hashSet.add(new Person("Leny", 23));
        hashSet.add(new Person("Henry", 49));
        hashSet.add(new Person("Francis", 61));

        System.out.println("Hash Set: " + hashSet);

        // TREE SET -> Es mas lenta que HashSet ya que esta ordena los datos
        // (utiliza una interfaz "Comparable")
        TreeSet<String>  treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("B");
        System.out.println("Tree Set: " + treeSet);

        // LINKED HASH SET -> Almacena los valores respetando el orden en el que se insertan
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("Leny", 23));
        linkedHashSet.add(new Person("John", 34));
        linkedHashSet.add(new Person("Henry", 49));
        linkedHashSet.add(new Person("Francis", 61));
        System.out.println("Link Set: " + linkedHashSet);
    }
}