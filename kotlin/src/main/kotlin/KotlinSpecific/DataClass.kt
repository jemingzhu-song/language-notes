package KotlinSpecific

/* ==================== Sealed Classes ==================== */
// https://www.programiz.com/kotlin-programming/data-class

/*
    There may arise a situation where you need to create a class solely to hold data.
    In such cases, you can mark the class as data to create a data class. For example:

        data class Person(val name: String, var age: Int)

    In this class above, the "Person" class is solely used to store the data/information about each "Person"

    For this class, the compiler AUTOMATICALLY generates:
        • copy() function
        • equals() and hashCode() pair
        • toString() form of the primary constructor
        • componentN() functions

    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    This is because a NORMAL Class does not automatically generate the above methods
*/

// Requirements of Data Classes
/*
    Here are the requirements:
        • The primary constructor must have at least one parameter.
        • The parameters of the primary constructor must be marked as either val (read-only) or var (read-write).
        • The class cannot be open, abstract, inner or sealed.
        • The class may extend other classes or implement interfaces. If you are using Kotlin version before 1.1,
        • the class can only implement interfaces.
*/

data class User(val name: String, val age: Int)

fun main() {
    /*
        The Data Class "User" automatically generates an "equals()" method, which returns true if two objects
        have the same values
    */
    var user1: User = User("Michael", 20)
    var user2: User = User("Michael", 20)
    var user3: User = User("Michael", 21)

    println(user1 == user2) // true
    println(user1 == user3) // false

    /*
        The Data Class "User" also generates an "copy()" method, which allows us to create an identical copy of
        an object (i.e. when you use the "equals()" method on it, it will return true)
    */
    var user4: User = User("Kenny", 15)
    var user5: User = user4.copy()

    println(user4 == user5) // true
}