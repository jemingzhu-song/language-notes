package OOP

/* ==================== Abstract Classes ==================== */
fun main() {

}

/*
    Similar to Java, Abstract Classes in Kotlin cannot be instantiated, but you can inherit subclasses
    from them.

    The members (properties and methods) of an abstract class are non-abstract unless you explictly use
    "abstract" keyword to make them abstract.
*/
public abstract class Animal(species: String) {
    var species: String = species
    /*
        Properties/Fields in an Abstract Class can also be declared as "abstract", meaning they don't need
        to be initialised in the Abstract Class itself. If you reference this abstract property/field within
        this abstract class itself, it will refer to the value that will be overridden by the class that
        inherits/extends this abstract class
     */
    abstract var breed: String

    fun animal() {
        println("This is an Animal of species: $species")
    }

    abstract fun action()
    }

/*
    Since the "Animal" Abstract Class had an abstract property called: "species", we need to override
    it in the constructor of this "Dog" Class.
*/
public class Dog(species: String, override var breed: String, friendliness: Int): Animal(species) {
    var friendliness: Int = friendliness

    override fun action() {
        println("Bark!")
    }

    fun dog() {
        if (friendliness > 5) {
            println("This dog is safe to play with!")
        } else {
            println("This dog is not safe to play with! :(")
        }
    }
}

