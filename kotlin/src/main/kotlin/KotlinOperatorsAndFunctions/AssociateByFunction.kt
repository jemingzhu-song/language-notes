package KotlinOperatorsAndFunctions

/*
    .associateBy {}

    inline fun <T, K> Sequence<T>.associateBy(
        keySelector: (T) -> K
    ): Map<K, T>

    Returns a Map containing the elements from the given sequence indexed by the key
    returned from keySelector function applied to each element.

    If any two elements would have the same key returned by keySelector the last one gets
    added to the map.

    The returned map preserves the entry iteration order of the original sequence.
*/

fun main() {
    val scientists = listOf(Person("Grace", "Hopper"), Person("Jacob", "Bernoulli"), Person("Johann", "Bernoulli"))

    /*
        Basically, whatever you pass into the .associateBy {} function becomes the new
        Key in the map that is created, and the Value is whatever the element currently is.

        In the below, the "it.lastName" becomes the new Key, and the actual Person object
        becomes the new Value in the map.
    */
    val byLastName = scientists.associateBy { it.lastName }

    println(byLastName)
}

class Person(var firstName: String, var lastName: String) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}