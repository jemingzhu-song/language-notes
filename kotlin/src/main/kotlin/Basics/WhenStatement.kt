package Basics

/* ==================== "when" statement ==================== */
// https://www.programiz.com/kotlin-programming/when-expression
fun main() {
    /*
        The "when" statement in Kotlin is similar to a "switch" statement in Java

        The general syntax:
            when ([variable]) {
                null -> [codeBlock]          // Run when the [variable] is equal to null
                else -> [codeBlock]          // Same as the "default" case of a "switch" statement
            }
    */
    val num: Int = 3

    when(num) {
        1 -> {
            println("Monday")
            // More code if needed
        }
        2 -> {
            println("Tuesday")
        }
        3 -> {
            println("Wednesday")
        }
        /*
            You can also have MULTIPLE criteria/possibilities in one branch by separating them with a ","
            (a comma).
         */
        6, 7 -> {
            println("Weekend!")
        }
        null -> println("Null Value")
        else -> {
            println("The 'Default' Case!!!")
            // More code if needed
        }
    }

}