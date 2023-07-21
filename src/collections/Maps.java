package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

// Asocia los valores con claves o keys
public class Maps {
    public static void main(String[] args) {
        // HASH MAP -> El orden de los datos puede cambiar cuando se agrega un dato
        HashMap<Integer, Person> hashMap = new HashMap<>();
        hashMap.put(2,new Person("John", 34));
        hashMap.put(1,new Person("Leny", 23));
        hashMap.put(3,new Person("Henry", 49));
        hashMap.put(4,new Person("Francis", 61));
        System.out.println("Hash Map: " + hashMap);

        // TREE MAP -> Integra valores de acuerdo a los valores de sus claves
        TreeMap<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(4,new Person("John", 34));
        treeMap.put(2,new Person("Leny", 23));
        treeMap.put(3,new Person("Henry", 49));
        treeMap.put(1,new Person("Francis", 61));
        System.out.println("Tree Map: " + treeMap);

        // LINKED HASH MAP -> Almacena valores de acuerdo a el orden en que se insertan
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3,new Person("John", 34));
        linkedHashMap.put(2,new Person("Leny", 23));
        linkedHashMap.put(1,new Person("Henry", 49));
        linkedHashMap.put(4,new Person("Francis", 61));
        System.out.println("Link Map: " + linkedHashMap);
    }
}
