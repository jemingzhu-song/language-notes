package Basics

/* ==================== Variables ==================== */

/*
    The main difference between Java and Kotlin is that type in Kotlin are NON-NULL by default.
    This means there is a distinct difference between, for example, a String, and a Nullable-String.

    https://stackoverflow.com/questions/52964417/how-to-create-variable-in-kotlin-without-initialization

    In Java, when you declare a variable but don't initialise it (i.e. you don't assign a value to it),
    the variable will implicitly be declared as "null". Kotlin doesn't automatically have this
    behaviour due to the variables being non-null by default.
 */
/*
    For example, the variable below called "cheeseString" is a Non-Null String.
    This means if we try to assign this variable to equal "null" (shown in the line that has been
    commented out below), you'll get an error:
*/
//var cheeseString: String = null
/*
    In order to declare a variable in Kotlin and not initialise/assign it a value, you must use a
    "?" at the end of the variable type, and set it equal to null:
*/
var cheesyString: String? = null

/*
    Variables can also be declared outside any type of enclosing FUNCTION or CLASS.
    Variables like this are known as "Top-Level Variables"
*/
val topLevelVariable: String = "I'm a 'Top-Level' String Variable :)"

fun main() {
    println(topLevelVariable)

    /*
        There are two keywords for assigning variables in Kotlin:
            1. val - read-only local variables which can only be assigned a value ONCE. They cannot
                     be re-assigned to another value.
            2. var - variables which can be re-assigned

        The general syntax to assign a NON-NULL variable in Kotlin is:
            val [variableName]: [variableType] = [value]
            var [variableName]: [variableType] = [value]

        The general syntax to assign a NULLABLE variable (i.e. a variable which can be equal to
        null when you declare it, or when you re-assign it) in Kotlin is:
            val [variableName]: [variableType]? = null
            var [variableName]: [variableType]? = null
    */

    val sentence0: String = "This is a sentence"
    println(sentence0)

    var sentence1: String = "A quick brown fox"
    // re-assigning the "var" variable
    sentence1 = "jumped over the lazy dog"
    println(sentence1)

    /*
        Kotlin can also INFER type declarations. So you are not required to specify the variable
        type when you declare a variable.

        The syntax to assign variables where the type will be inferred is:
            val [variableName] = [value]

        However, if you want to declare a nullable variable (i.e. a variable you want to assign to
        be as null when you declare it, or when you re-assign it), you must specify the type.
    */
    val sentence2 = "Good evening"

    /*
        Variable Types in Kotlin are the same as Java, but with the names all starting with capitals
            • String
            • Char
            • Int
            • Float
            • Double
            • Boolean
    */
    var sentenceVariable: String = "A sentence in Kotlin"
    var characterVariable: Char = 'Z'
    var integerVariable: Int = 23
    var floatVariable: Float = 63.32f
    var doubleVariable: Double = 84.32
    var booleanVariable: Boolean = false

}