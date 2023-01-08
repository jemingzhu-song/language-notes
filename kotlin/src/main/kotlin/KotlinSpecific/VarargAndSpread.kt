package Basics

/* ==================== vararg and the "Spread" Operator ==================== */
/*
    In Kotlin, the "vararg" keyword allows you to declare a function with a "variable number of
    arguments" (i.e. optional number of arguments). Any variables in the function parameters with
    the "vararg" prefix before it will mean this parameter will take in a variable number of parameters
    after it. Inside the function, this variable number of parameters will be treated as an Array
    of the parameter type.

    In this case, the "vararg" keyword gives you the flexibility to define a function with an
    optional number of parameters.
 */

/*
    The "vararg" keyword before the itemsToGreet will tell the compiler that the "itemsToGreet" parameter
    will be a variable number of parameters (i.e. it can be 0 or 1 or 2 or 5 String parameters).
    In the function body, the "itemsToGreet" parameter will be treated as an Array of Strings, i.e.
    Array<String> because it is a variable number.
 */
fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println(itemToGreet)
    }
}

fun main() {
    sayHello("Hello")

    sayHello("Hi", "Jenny", "Kenny", "Adam", "Lucas")

    /*
        If you have an existing collection, such as an Array, and you want to pass it into
        the function with a "vararg" parameter, it won't work. Instead, you need to use the
        spread operator "*" for this to work with the "vararg" parameter.
    */
    val names: Array<String> = arrayOf("Adam", "Brian", "Charles", "Danny")
    // This won't work
    // sayHello("Howdy", names)
    // This works (using the Spread Operator)
    sayHello("Howdy", *names)
}