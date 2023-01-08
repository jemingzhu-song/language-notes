package KotlinSpecific

/* ==================== Extension Functions & Properties ==================== */

/* ==================== Extension Functions ==================== */
/*
    Suppose, you need to extend a class with new functionalities. In most programming languages,
    you either derive a new class or use some kind of design pattern to do this.

    However, in Kotlin, you can also use extension function to extend a class with new functionalities.
    Basically, an extension function is a member function of a class that is defined outside the class.
    This will apply to all "future" instances of the class.

    Syntax:
        fun <ClassName>.<ExtensionFunctionName>(<params>...) {
            // Function Body
        }

    For example, you need to use a method to the String class that returns a new string with first and last
    character removed; this method is not already available in String class. You can use extension function to
    accomplish this task.

*/

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main() {
    var updated: String = "This is a sentence".removeFirstLastChar()
    println(updated)

    var property: String = "Hello".MyCustomExtensionProperty
    println(property)
}


// When you run the program, the output will be: First character is: ello Everyon

/*
    Here, an extension function removeFirstLastChar() is added to the String class.

    The class name is the receiver type (String class in our example). The "this" keyword inside the
    extension function refers the receiver object.
 */

/* ==================== Extension Properties ==================== */
/*
    You can also define Extension Properties, in a similar way to Extension Methods.
    This must be defined outside a function or a main function body (since it can't be a local declaration)
*/
var String.MyCustomExtensionProperty: String
    get() = "Howdy"
    set(value) {}

