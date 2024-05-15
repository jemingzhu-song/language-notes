package KotlinOperatorsAndFunctions

/*
    Kotlin Elvis Operator is the "?:" operator

    x ?: y // yields `x` if `x` is not null, `y` otherwise.
*/
fun main() {
    var input: String? = "Input"

    var result: String = input ?: "NA"

    println(result)
}