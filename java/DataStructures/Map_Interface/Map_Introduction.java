package DataStructures.Map_Interface;

/*
    Notes
    1.  Elements of "Map" are stored in key/value pairs. Keys are unique values associated
        with individual Values.
    2.  A Map cannot contain duplicate keys - each key is associated with a single value.
*/

/* ------------------------------ Classes that Implement Map ------------------------------ */
/*
    Since Map is an interface, we cannot create objects from it.
    In order to use functionalities of the Map interface, we can use these classes:
        1) HashMap
        2) EnumMap
        3) LinkedHashMap
        4) WeakHashMap
        5) TreeMap
*/

/* ------------------------------ Interfaces that Extend Map ------------------------------ */
/*
    The Map interface is also extended by these subinterfaces:
        1) SortedMap
        2) NavigableMap
        3) ConcurrentMap
*/

/* ------------------------------ Methods of Map Interface ------------------------------ */
/*
    The Map interface includes all the methods of the Collection interface. 
    Its because Collection is a super interface of Map.

    Some of the commonly used methods of the Collection interface that's also 
    available in the Map interface are:

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
*/
public class Map_Introduction {
}

