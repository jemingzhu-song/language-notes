package KotlinOperatorsAndFunctions

/*
    .any{} is a function for an Iterable and Map interfaces.

    It takes a conditional statement, and returns true if any of the items in the List, Set or
    Map confirms that condition, otherwise it returns false.
*/

fun main() {
    val list = listOf("one", "two", "three", "four")
    val set = setOf("one", "two", "three", "four")
    val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")

    println(list.any { it.endsWith("e") })    // true
    println(set.any { it.endsWith("e") })    // true
    println(map.any { it.value.endsWith("e") })    // true
}