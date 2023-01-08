package KotlinSpecific

/* ==================== Companion Object ==================== */

/*
    Take an example of a class: "LunchBox".

    In the main function below, we created an object "lunchbox1" of the LunchBox class to call the "callMe()"
    method. That's how we normally call a method of a class.

    However, Kotlin also allows you to call methods of a Class by using the Class Name itself (i.e. similar to
    how you can do so in Java by using the "static" keyword for methods). In Kotlin, you need to create
    a Companion Object by marking the object declaration with a "companion" keyword.
*/
public class LunchBox {
    fun callMe() = println("LunchBox Called!")

    private fun privateMethod() = println("Private Method Called!")

    /*
        Here, we declare a Companion Object for this "LunchBox" class. This will allow methods
        of this class to be called by using the Class Name itself, instead of having to instantiate an object
        of this class first, then calling the method from that object. (Similar to "static" keyword in Java).

        The name of the companion object is OPTIONAL and can be omitted (i.e. in the example below, we don't need
        to provide the "LunchBoxCompanion" name, rather we can just write:

            companion object {
                // Code Block
            }

        Companion Objects can also implement Interfaces and can also "extend"/inherit classes.
        However, a Companion Object itself is not inheritable (i.e. it cannot be extended by another Class).
    */
    companion object LunchBoxCompanion {
        /*
            You can also store properties/fields in your Companion Object as well
        */
        var LUNCHBOX_CONSTANT: String = "CONSTANT_LUNCHBOX"

        fun companionCallMe() = println("LunchBox Companion Method Called!")

        /*
            Companion Objects can also access private properties and methods of the Class they are in.
        */
        fun privateCallMe() {
            println(LUNCHBOX_CONSTANT)
        }
    }
}

fun main() {
    var lunchBox1 = LunchBox()
    lunchBox1.callMe()

    // The reference to the Companion Object here is inferred
    LunchBox.companionCallMe()
    // If your Companion Object has a name, you can also reference the name to make your code more readable
    LunchBox.LunchBoxCompanion.companionCallMe()
}