package DataStructures

/* ==================== Maps ==================== */
fun main() {
    /*
        In Kotlin, Maps use a "to" keyword to indicate a Key, Value pairing.
        There are multiple types of options to create Maps in Kotlin:

        1. mapOf()
        Create a read-only map

        Example:
            // Implicit Declaration
            val people = mapOf(1 to "Jenny", 2 to "James", 3 to "Michael", 4 to "Kenny")
            // Explicit Declaration
            val people: Map<Int, String> = mapOf<Int, String>(9 to "Zion", 2 to "Charles", 5 to "Adam")

        2. mutableMapOf()
        Creates a MutableMap. This time you can modify (add/remove) elements.

        Example:
            // Implicit Declaration
            val people = mutableMapOf(1 to "Jenny", 2 to "James", 3 to "Michael", 4 to "Kenny")
            // Explicit Declaration
            val people: MutableMap<Int, String> = mutableMapOf<Int, String>(9 to "Zion", 2 to "Charles")

        3. HashMap<K, V>()
        Creates a HashMap, which is based off the MutableMap interface. It must be defined
        explicitly.

        Example:
            // Empty HashMap
            val people = HashMap<Int, String>()
            // Initialised HashMap
            val people = HashMap<Int, String>(mapOf(1 to "Jenny", 2 to "Adam"))
    */

    // Note: Functions are the same for Maps and HashMaps
    val people1: MutableMap<Int, String> = mutableMapOf<Int, String>()
    // alternatively:
    // val people1: HashMap<Int, String> = HashMap<Int, String>()

    // 1. Add to Map: .put() or []
    people1.put(1, "Kenny")
    people1[3] = "Adam"
    people1.put(4, "Charles")
    people1[2] = "Zion"
    people1.put(5, "Xavier")
    println(people1)

    // 2. Iterate Over Map
    for ((key, value) in people1) {
        println("$key : $value")
    }

    // Alternatively...
    people1.forEach{ (key, value) ->
        println("$key : $value")
    }

    // 3. Check if Key or Value in Map: .containsKey() or .containsValue()
    println(people1.containsKey(2)) // true
    println(people1.containsKey(100)) // false
    println(people1.containsValue("Adam")) // true
    println(people1.containsValue("Tomato")) // false

    // 3. Get from Map: .get() or []
    println(people1.get(2)) // Zion
    println(people1[3]) // Adam

    // 3. A) Get all Keys: .keys (MutableSet<K>)
    val keys: MutableSet<Int> = people1.keys
    for (key in keys) {
        println(key);
    }

    // 3. B) Get all Values: .values (MutableCollection<V>)
    val values: MutableCollection<String> = people1.values
    for (value in values) {
        println(value)
    }

    // 3. C) Get Key, Value Pairs: .entries (MutableSet<MutableMap.MutableEntry<K, V>>)
    val entries: MutableSet<MutableMap.MutableEntry<Int, String>> = people1.entries
    for (entry in entries) {
        println(entry)
    }

    // 4. Edit Map: .set() or []
    people1.set(2, "ZION")
    people1[1] = "KENNY"
    println(people1)

    // 5. Remove from Map: .remove(K) or .remove(K, V)
    people1.remove(2)
    println(people1)
    people1.remove(5, "Xav")
    println(people1)
    people1.remove(5, "Xavier")
    println(people1)

}