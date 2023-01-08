package Basics

/* ==================== Functions ==================== */
/*
    The general syntax to declare/create a function in Kotlin:

        fun [functionName] ([param1], [param2], ... , [paramN]): [returnType] {
            // Code Block

            return [variable]
        }
*/
fun getGreeting(): String {
    return "Welcome everyone to the class!"
}

/*
    If you want to have a function that doesn't return anything, (i.e. in Java, a "void" function),
    you can just not specify a return type:

        fun [functionName] ([param1], [param2], ... , [paramN]) {
            // Code Block
        }
*/
fun sayHello() {
    println("Hello world!")
}

/*
    If you want a function that is also able to return a null value, then you need to add the
    "?" to the end of the return type
*/
fun getNullGreeting(): String? {
    return null
}

/*
    Functions also support type-inference.
    So if a function is "relatively simple", we can reduce it to a single expression function
    definition
*/
fun getGreeting2(): String = "Hello World 2!"
// Since the function above is also returning a String, we can reduce this even further by removing
// the return type
fun getGreeting3() = "Hello World 3!"

/*
    Function Parameter Syntax:

        fun [functionName]([param1]: [dataType], [param2]: [dataType], ...): [returnType] {
            // Code Block
            return [variable]
        }
*/
fun dayOfWeek(day: Int): String? {
    return when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day Number"
    }
}

// Function that takes in a List of Strings, and prints each one out
fun printList(elements: List<String>) {
    elements.forEachIndexed { index, element ->
        println("Element: $element | Index: $index")
    }
}

/*
    So far, all the functions we have declared and defined above are outside any type of
    enclosing class, and are hence not associated with any class.

    Functions like these are known as "Top-Level Functions"
*/

fun main() {
    println(getGreeting())
    sayHello()

    println(dayOfWeek(1))
    println(dayOfWeek(4))
    println(dayOfWeek(-1))

    printList(listOf("Michael", "Adam", "Charles", "Zion", "Peter", "Brian"))

}