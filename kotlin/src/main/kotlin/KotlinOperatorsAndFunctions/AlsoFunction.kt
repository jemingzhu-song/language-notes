package KotlinOperatorsAndFunctions

/*
    .also{}

    inline fun <T> T.also(block: (T) -> Unit): T

    Given an object, you can call .also{} on it, and perform operations on it using the "it"
    keyword, and .also{} will return the same object in its unaltered/original state.

    The main use of .also{} is to execute a block of code on an object WITHOUT ALTERING ITS
    ORIGINAL state
*/

fun main() {
    val myString = "Hello, Kotlin!".also { str ->
        println(str) // Print the value of myString
    }
    .also{
        it + "!!!"
    }
    .also { println( it) } // Will still print "Hello, Kotlin" and not "Hello, Kotlin!!!" because
    // .also{} returns the object in its unaltered/original state even if you attempt to change
    // it in the block
}