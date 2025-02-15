package OOP

/* ==================== Classes ==================== */

/*
    Kotlin has the following modifiers that apply to Classes, Functions, Objects, Properties (which are
    defined at the "top level"):
        1. public (default)
        2. internal - only can be used/accessed within the same Module/Package (Java "protected" equivalent)
        3. private - only can be used within the file in which it is implemented

    Kotlin has the following modifiers that apply to Methods and Fields/Properties of Classes
        1. public (default)
        2. protected - same as private, but can is also visible for the subclasses of that class
        3. private - only can be used within the class itself
        4. internal - can only be used within the same module/package

*/

// https://kotlinlang.org/docs/classes.html
class Classes {

}

fun main() {
    /*
        In Kotlin, you don't need a "new" keyword when you create an instance of a Class. You can
        directly just call the constructor.
    */
    val person1 = Person("Michael", "Kim", 23)
    /*
        In Kotlin, we can access or modify properties/fields of Classes directly using the "." operator,
        we don't need getters or setters to do so.

        However, if the fields/properties are "private", then you will need to define your own
        getters and setters in order to access these fields/properties
    */
    println(person1.firstName)
    person1.nickName = "Mikey"
    println(person1.getInfo())

    val person2 = Person("Kenny", "Wong")
}

/*
    Classes in Kotlin have a primary constructor and one or more secondary constructors.
    The primary constructor is a part of the class "header", and it goes right after the class name

    Syntax:
        class Person constructor(firstName: String) { /*...*/ }

    If the primary constructor does not have any annotations or visibility modifiers, the
    "constructor" keyword can be omitted:

    Syntax:
        class Person(firstName: String) { /* ... */ }
 */
public class Person(firstName: String, lastName: String) {
    /*
        Like Java, Classes in Kotlin also have fields.

        You can initialise these fields directly where you are defined.
    */
    val firstName: String;
    var lastName: String = lastName
        // The getter will always have the same modifier as the property. Here, the property is
        // public (by default), so the getter is also public.
        get() = field
        // The setter can have a different modifier than the property itself. Here, the setter is
        // private, whilst the property is public (by default)
        private set(value) {
            println("Private Setter")
            field = value
        }
    private var age: Int? = null

    /*
        Since Kotlin allows us to get and set fields of Classes directly using the "." operator, it
        means Kotlin provides us with "default" getters and setters built-in. However, we can also
        override these getters and setters by using the get() {} and set(value() {} functions.

        By default, the fields have a "public" modifier.

        IMPORTANT: The getter will always have the same visibility as the property itself.
        For example, if the property is private, the getter is also private. However, the setter
        can have a different visibility modifier than the property. For example, if the property is
        public, the setter can be defined to be private.
    */

    /*
        get() {}
            Must have a "return" statement to return a value that will be the result of this getter.
            The getter will always have the same visibility as the property itself.

        set(value) {}
            To set a field, you need to use the "field" keyword, and set this equal to the value.
            The setter can have a different visibility modifier than the property.
     */
    var nickName: String? = null
        get() {
            println("Custom 'nickName' Getter")
            return field
        }
        set(value) {
            field = value
            println("Custom 'nickName' Setter")
        }

    /*
        Fields in Kotlin Classes must be initialised, and they can also be initialised in an
        initialiser block, prefixed with the "init" keyword. These blocks of code are run
        every time an instance of this class is created.

        You can have MULTIPLE "intiialiser blocks", and these initializer blocks are executed in
        the same order as they appear in the class body, interleaved with the property initializers.
     */
    init {
        println("Creating 'Person' Class...")
    }

    init {
        this.firstName = firstName;
        // Since "lastName" and "age" are initialised where it is defined, we don't need to initialise it here.
    }

    /*
        Kotlin Classes can also have "secondary constructors", which are prefixed "constructor" and
        are defined in the class block.

        If the class has a primary constructor, each secondary constructor needs to delegate to the
        primary constructor, either directly or indirectly through another secondary constructor(s).
        Delegation to another constructor of the same class is done using the "this" keyword.
    */
    /*
        In this example, this secondary constructor is for a case where the "age" parameter is also
        passed in when initialising the class
    */
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
    }

    /*
        Class Method
    */
    fun getInfo(): String {
        // Since the "nickName" field may not be initialised
        val nickNameToPrint = if (nickName != null) nickName else "[No Nickname]"
        return "$firstName ($nickNameToPrint) $lastName $age"
    }

    /*
        Private Class Method
     */
    private fun secret(): String {
        return "Secret Function..."
    }
}

/*
    Classes in Kotlin also allow you to define fields of the class directly in the primary constructor
    by adding the "val" or "var" keyword before
*/
class AnotherPerson(var firstName: String, var lastName: String) {
    // Code Block
}

/*
    Classes in Kotlin also allow you to give default values in the primary constructor
*/
class AnotherAnotherPerson(var firstName: String = "Peter", var lastName: String = "Parker") {
    // Code Block
}