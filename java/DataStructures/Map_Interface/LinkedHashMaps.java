package DataStructures.Map_Interface;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    Notes
    1.  The LinkedHashMap class extends the HashMap class to store entries in a hash table. It internally maintains a doubly-linked list
        among all of its entries to order its entries.
    2.  LinkedHashMap differs from HashMap in a few ways:
            1) LinkedHashMap maintains the insertion order of its elements because it maintains a doubly-linked list internally.
            2) The LinkedHashMap class requires more storage than HashMap. This is because LinkedHashMap maintains linked lists internally.
            3) The performance of LinkedHashMap is slower than HashMap.
    3.  Syntax for creating a LinkedHashMap:
            LinkedHashMap<Key, Value> variableName = new LinkedHashMap<>();
    4.  Methods of LinkedHashMap are the same as the HashMap class (since it extends the HashMap class)
*/

public class LinkedHashMaps {
    public static void main(String[] args) {
        /* LinkedHashMap maintains insertion order of its elements. */
        LinkedHashMap<Integer, String> people = new LinkedHashMap<>();
    
        people.put(5, "James");
        people.put(2, "Nishil");
        people.put(10, "Mary");
        people.put(4, "Grant");
        people.put(7, "Adam");

        System.out.println(people);

        /* HashMap and TreeMap DO NOT maintain insertion order of its elements */
        HashMap<Integer, String> people1 = new HashMap<>();
    
        people1.put(5, "James");
        people1.put(2, "Nishil");
        people1.put(10, "Mary");
        people1.put(4, "Grant");
        people1.put(7, "Adam");

        System.out.println(people1);
    }
}
