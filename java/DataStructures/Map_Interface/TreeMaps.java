package DataStructures.Map_Interface;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
    Notes
    0.  TreeMap is similar to HashMap, however you can order the elements. The methods are
        similar to HashMap. This is because HashMap doesn't guarantee any order.
    1.  The TreeMap Class provides a tree data structure implementation.
    2.  Syntax for creating a TreeMap:
            TreeMap<Key, Value> variableName = new TreeMap<>();
    3.  Methods of TreeMap:
            1) put() - inserts the specified key/value mapping (entry) to the map
            2) putAll() - inserts all the entries from specified map to this map
            3) putIfAbsent() - inserts the specified key/value mapping to the map if the 
                               specified key is not present in the map
            4) entrySet() - returns a set of all the key/values mapping (entry) of a treemap
            5) keySet() - returns a set of all the keys of a tree map
            6) values() - returns a set of all the maps of a tree map
            7) get() - Returns the value associated with the specified key. Returns null if 
                       the key is not found.
            8) getOrDefault() - Returns the value associated with the specified key. 
                                Returns the specified default value if the key is not found.
            9) remove(key) - returns and removes the entry associated with the specified key 
                             from a TreeMap
            10) remove(key, value) - removes the entry from the map only if the specified 
                                     key is associated with the specified value and returns a 
                                     boolean value
            11) replace(key, value) - replaces the value mapped by the specified key with 
                                      the new value
            12) replace(key, old, new) - replaces the old value with the new value only if 
                                         the old value is already associated with the 
                                         specified key
            13) replaceAll(function) - replaces each value of the map with the result of the 
                                       specified function
*/

public class TreeMaps {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> profiles = new TreeMap<>();
    
        // 1. Adding elements to TreeMap
        profiles.put(1, "Johnny");
        profiles.put(2, "Vivian");
        profiles.put(3, "Adam");
        profiles.put(4, "Kris");
        profiles.put(5, "Crason");
        profiles.put(6, "Michael");
        profiles.put(7, "Zion");
        System.out.println(profiles);

        // 2. Accessing TreeMap Elements
        // i) Get Value associated with Key: .get()
        String value = profiles.get(2);
        System.out.println(value);
        // ii) Get set of Keys: .keySet()
        Set<Integer> keys = profiles.keySet();
        // Iterate through Keys...
        for (int key : keys) {
            System.out.println(key);
        }
        System.out.println(keys);
        // iii) Get set of Values: .values()
        Collection<String> values = profiles.values();
        // Iterate through Values...
        for (String v: values) {
            System.out.println(v);
        }
        System.out.println(values);
        // iv) Get set of (Key, Value) Pairs
        Set<Entry<Integer, String>> pairs = profiles.entrySet();
        // Iterate through Key/Value Pairs...
        for (Entry<Integer, String> e : pairs) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        // 3. Change HashMap Value: .replace()
        profiles.replace(1, "Johnny Dogs");
        System.out.println(profiles);

        // 4. Remove HashMap Element: .remove()
        profiles.remove(1);
        System.out.println(profiles);
        
        /* -------------------- A) Sorting Keys of TreeMap -------------------- */
        System.out.println("");
        System.out.println("---------- Sorting TreeMaps by Key ----------");
        System.out.println("Sorting by descending order of Keys");
        System.out.println("");
        // Sort keys by descending order by parsing in: SortByKeys comparator
        TreeMap<Integer, String> sortedKeys = new TreeMap<>(new SortByKeys());
    
        // 1. Adding elements to TreeMap
        sortedKeys.put(1, "Johnny");
        sortedKeys.put(2, "Vivian");
        sortedKeys.put(3, "Adam");
        sortedKeys.put(4, "Kris");
        sortedKeys.put(5, "Crason");
        sortedKeys.put(6, "Michael");
        sortedKeys.put(7, "Zion");
        System.out.println(sortedKeys);

        /* -------------------- B) Sorting Values of TreeMap -------------------- 
        (helpful link) https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/ */
        System.out.println("");
        System.out.println("---------- Sorting TreeMaps by Value ----------");
        System.out.println("Sorting by alphabetical order of values");
        System.out.println("");
        // Initialise
        TreeMap<Integer, String> unsortedValues = new TreeMap<>();
    
        // 1. Adding elements to TreeMap
        unsortedValues.put(1, "Johnny");
        unsortedValues.put(2, "Vivian");
        unsortedValues.put(3, "Adam");
        unsortedValues.put(4, "Kris");
        unsortedValues.put(5, "Crason");
        unsortedValues.put(6, "Michael");
        unsortedValues.put(7, "Zion");

        // 2. Get the EntrySet of the TreeMap
        Set<Entry<Integer, String>> unsortedEntrySet = unsortedValues.entrySet();

        // 3. Convert this EntrySet into a LinkedList
        List<Entry<Integer, String>> unsortedLinkedListEntry = new LinkedList<>();
        unsortedLinkedListEntry.addAll(unsortedEntrySet);

        // 4. Sort the List using Collections.sort() - sort values by alphabetical order
        Collections.sort(unsortedLinkedListEntry, new SortByValues());

        // 5. Convert into LinkedHashMap
        LinkedHashMap<Integer, String> sortedValues = new LinkedHashMap<>();
        for (Entry<Integer, String> e : unsortedLinkedListEntry) {
            sortedValues.put(e.getKey(), e.getValue());
        }
        System.out.println(sortedValues);

        /* -------------------- C) Sorting Keys & Values of TreeMap -------------------- */
        System.out.println("");
        System.out.println("---------- Sorting TreeMaps by Keys & Value ----------");
        System.out.println("Sorting by alphabetical order of Values. If two Values are equal, sort according by descending order of Keys");
        System.out.println("");
        // Sort keys by descending order by parsing in: SortByKeys comparator
        TreeMap<Integer, String> unsorted = new TreeMap<>(new SortByKeys());
    
        // 1. Adding elements to TreeMap
        unsorted.put(5, "Crason");
        unsorted.put(9, "Adam");
        unsorted.put(7, "Zion");
        unsorted.put(1, "Crason");
        unsorted.put(2, "Zion");
        unsorted.put(3, "Adam");
        unsorted.put(4, "Kris");
        unsorted.put(6, "Michael");
        unsorted.put(8, "Michael");

        // 2. Get the EntrySet of the TreeMap
        Set<Entry<Integer, String>> unsortedEntries = unsorted.entrySet();

        // 3. Convert this EntrySet into a LinkedList
        List<Entry<Integer, String>> unsortedList = new LinkedList<>();
        unsortedList.addAll(unsortedEntries);

        // 4. Sort the List using Collections.sort()
        Collections.sort(unsortedList, new SortByValues());

        // 5. Convert into LinkedHashMap
        LinkedHashMap<Integer, String> sorted = new LinkedHashMap<>();
        for (Entry<Integer, String> e : unsortedList) {
            sorted.put(e.getKey(), e.getValue());
        }
        System.out.println(sorted);
    }
}

class SortByKeys implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        if (number1 == number2) {
            return 0;
        } else if (number1 > number2) {
            return -1;
        } else { // number1 < number2
            return 1;
        }
    }
}

class SortByValues implements Comparator<Entry<Integer, String>> {
    @Override
    public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
        if ((o1.getValue()).equals(o2.getValue())) {
            return 0;
        } else {
            return (o1.getValue()).compareTo(o2.getValue());
        }
    }
}