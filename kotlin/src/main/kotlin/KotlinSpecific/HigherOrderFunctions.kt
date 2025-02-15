package KotlinSpecific

/* ==================== Higher Order Functions ==================== */
/*
    Higher Order Functions are functions that either return another function, or take functions as parameter values.

    Much of Kotlin's standard library is built on top of Higher Order Functions.
*/

/*
    To define a parameter as a function itself, the syntax is:

        <parameterVariableName>: (<functionParam1>, <functionParam2>, ...) -> <returnType>

    In order to pass a function as a parameter, you must define it as a "variable". The syntax is:
        val <functionName> = fun (<param1>, <param2>, ... <paramN>) {
            // function body
        }
*/

/*
    In this example, the "printFunction" parameter takes in a function as a parameter, and this function will
    take in a String as a parameter, and return void (or in Kotlin's case, "Unit")
*/
fun printFilteredStrings(list: List<String>, printFunction: (String) -> Unit) {
    /* This function lets us pass in a list of Strings, and a function "printFunction", which will
    be called upon each element in the list to print it out in a customised way */
    list.forEach(printFunction)
}

/*
    In order to pass a function as a parameter, you must define it as a "variable"
*/
// Custom "printFunction" 1
val customPrint1 = fun (element: String) {
    println("$element!!!")
}

// Custom "printFunction" 2
val customPrint2 = fun (element: String) {
    println("$element :) :) :)")
}

fun main() {
    val strings: List<String> = listOf("Apple", "Banana", "Cherry", "Durian", "Eggplant")
    /*
        In order to pass a function as a parameter, you must define it as a "variable"
    */
    printFilteredStrings(strings, customPrint2)

    /* You can also use an Lambda Function as the parameter instead of defining it first someplace else
    Remember, the "it" keyword refers to each instance of this element.
    */
    printFilteredStrings(strings, { println("$it YAY")})

    /* Trailing Lambdas: https://kotlinlang.org/docs/lambdas.html#passing-trailing-lambdas
    According to Kotlin convention, if the last parameter of a function is a function,
    then a lambda expression passed as the corresponding argument can be placed outside the parentheses

    If the lambda is the only argument in that call, the parentheses can be omitted entirely
    */
    printFilteredStrings(strings) {
        println("Trailing Lambda: $it")
    }
}