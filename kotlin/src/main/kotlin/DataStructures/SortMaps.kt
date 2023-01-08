package DataStructures

import java.util.*
import kotlin.Comparator
import kotlin.collections.LinkedHashMap


fun main() {
    // 1. Sort by Keys
    /* You can either pass the function with a "fun" keyword directly in here, or declare it as a
    class that implements the "Comparator<Type>" Class, shown below */
    var people: TreeMap<Int, String> = TreeMap<Int, String>(fun (o1: Int?, o2: Int?): Int {
        if (o1 != null && o2 != null) {
            if (o1 > o2) {
                return -1
            } else {
                return 1
            }
        } else {
            return 0
        }
    })

    people.put(2, "Adam")
    people.put(3, "Charles")
    people.put(4, "Zion")
    people.put(1, "Xavier")
    people.put(6, "Dickson")
    people.put(5, "Kenny")

    println(people)

    // 2. Sort by Key, Value Pairs
    var foods: TreeMap<Int, String> = TreeMap<Int, String>()

    foods.put(2, "Apple")
    foods.put(5, "Banana")
    foods.put(1, "Pear")
    foods.put(3, "Zucchini")
    foods.put(4, "Capsicum")
    foods.put(6, "Yam")
    foods.put(7, "Durian")

    // Get EntrySet
    var entries: Set<Map.Entry<Int, String>> = foods.entries
    // Put into a List
    var listEntries: List<Map.Entry<Int, String>> = entries.toList()
    // Sort the List using: .sortWith()
    listEntries.sortedWith(sortKeyValuePairs())
    // Put into LinkedHashMap
    var sorted: LinkedHashMap<Int, String> = LinkedHashMap()
    for (e in listEntries) {
        sorted.put(e.key, e.value)
    }
    println(sorted)

}

class sortKeys(): Comparator<Int> {
    override fun compare(o1: Int?, o2: Int?): Int {
        if (o1 != null && o2 != null) {
            if (o1 > o2) {
                return -1
            } else {
                return 1
            }
        } else {
            return 0
        }
    }
}

class sortKeyValuePairs(): Comparator<Map.Entry<Int, String>> {
    override fun compare(o1: Map.Entry<Int, String>?, o2: Map.Entry<Int, String>?): Int {
        if (o1 != null && o2 != null) {
            if (o1.value == o2.value) {
                return 0
            } else {
                return o1.value.compareTo(o2.value) * -1
            }
        } else {
            return 0
        }
    }
}