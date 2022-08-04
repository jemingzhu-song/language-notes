package DataStructures.Map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

/*
    Notes
    1.  To create a HashMap, you need to import the "java.util.HashMap" package.
    2.  Syntax for creating a HashMap:
        
        HashMap<K, V> variableName = new HashMap<>();

            - K: represents the key type
            - V: represents the type of values

        e.g. HashMap<String, Integer> numbers = new HashMap();
    3.  In the "Map_Introduction.java" file, as discussed, the HashMap class implements the
        "Map" interface of the "collections" framework, and therefore has access to the following
        methods of the "Map" interface:

            1) put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
            2) putAll() - Inserts all the entries from the specified map to this map.
            3) putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
            4) get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
            5) getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
            6) containsKey(K) - Checks if the specified key K is present in the map or not.
            7) containsValue(V) - Checks if the specified value V is present in the map or not.
            8) replace(K, V) - Replace the value of the key K with the new specified value V.
            9) replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
            10) remove(K) - Removes the entry from the map represented by the key K.
            11) remove(K, V) - Removes the entry from the map that has key K associated with value V.
            12) keySet() - Returns a set of all the keys present in a map.
            13) values() - Returns a set of all the values present in a map.
            14) entrySet() - Returns a set of all the key/value mapping present in a map.
        
        Along with other methods:
            1) clear() - removes all mappings from the HashMap
            2) compute() - computes a new value for the specified key
            3) computeIfAbsent() - computes value if a mapping for the key is not present
            4) computeIfPresent() - computes a value for mapping if the key is present
            5) merge() - merges the specified mapping to the HashMap
            6) clone() - makes the copy of the HashMap
            7) containsKey() - checks if the specified key is present in Hashmap
            8) containsValue() - checks if Hashmap contains the specified value
            9) size() - returns the number of items in HashMap
            10) isEmpty() - checks if the Hashmap is empty
    4.  NOTE: Some of the functions (e.g. keySet(), values(), entrySet()) will return a
        "Collection" or "Set" - which both have no index/order - as they are unordered
        "lists". Therefore, use the Java for:each loop to iterate over them, or alternative
        methods here: https://knowm.org/iterating-through-a-collection-in-java/
*/

public class HashMaps {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> languages = new HashMap<>();
        
        // 1. Add elements to HashMap
        languages.put("Java", 8);
        languages.put("Python", 2);
        languages.put("C", 10);
        languages.put("HTML/CSS", 7);
        System.out.println(languages);

        // 2. Accessing HashMap Elements
        // i) Get Value associated with Key: .get()
        int value = languages.get("Java");
        System.out.println(value);
        // ii) Get set of Keys: .keySet()
        Set<String> keys = languages.keySet();
        // Iterate through Keys...
        for (String s : keys) {
            System.out.println(s);
        }
        System.out.println(keys);
        // iii) Get set of Values: .values()
        Collection<Integer> values = languages.values();
        // Iterate through Values...
        for (int v : values) {
            System.out.println(v);
        }
        System.out.println(values);
        // iv) Get set of (Key, Value) Pairs
        Set<Entry<String, Integer>> pairs = languages.entrySet();
        // Iterate through Key/Value Pairs...
        for (Entry<String, Integer> e : pairs) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        // 3. Change HashMap Value: .replace()
        languages.replace("C", 55);
        System.out.println(languages);

        // 4. Remove HashMap Element: .remove()
        languages.remove("C");
        System.out.println(languages);

        // 5. Check if Key or Value in HashMap
        System.out.println(languages.containsKey("Java"));
        System.out.println(languages.containsValue(7));
    }
}