package Basics

/* ==================== Control Flow ==================== */
fun main() {
    /*
        If-Else statements in Kotlin are exactly the same syntax as in Java.

        However, Kotlin also allows variables to be assigned based on an if-else statement or based
        off a "when" statement
    */
    val greeting: String? = null
    val greetingToPrint = if (greeting != null) { greeting } else { "Hello" }
    println(greetingToPrint)

    /*
        This is similar to the ternary operator in Java (i.e. the "?" and ":" combined operators). Hence,
        there is no ternary operator in Kotlin, as the if-else statement is the equivalent.

        If there are multiple lines/expressions in the If and/or in the Else branch, the LAST EXPRESSION
        is returned as the value of the block
    */
    val criteria: Int = 8
    val lessThan10 = if (criteria < 10) {
        println("Criteria Satisfied!")
        criteria
    } else {
        "Not Less than 10"
    }
    println(lessThan10)

    /*
        If-Else statements used to assign variables can also be extended to If-ElseIf-Else statements, or
        nested If-Else statement as well
    */
    var criteria1: Int = 1
    val lessThan50 = if (criteria1 < 20) {
        println("Less than 20!")
        "Less than 20"
    } else if (20 < criteria && criteria < 50) {
        println("20 < value < 50")
        if (20 < criteria && criteria < 30) {
            println("Between 20 and 30")
        } else {
            println("Between 30 and 50")
        }
    } else {
        println("Greater than 50!")
        "Greater than 50"
    }

    /*
        You can also use "When" statements to assign the values of variables
    */

    val another: String? = "Welcome"
    val anotherOne = when(another) {
        null -> "Hello"
        else -> another
    }
    println(anotherOne)
}