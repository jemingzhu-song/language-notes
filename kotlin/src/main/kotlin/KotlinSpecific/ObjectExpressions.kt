package KotlinSpecific

/* ==================== Object Expressions ==================== */
fun main() {
    /*
        Kotlin allows you to create Object Expressions, which are essentially objects of an anonymous class
        known as anonymous objects using the "object" keyword.

        They are used if you need to create an object of a slight modification of some class or interface
        without declaring a subclass for it. You can add or modify (over-ride) new or existing properties
        and methods.

        In order to create an Object Expession from an existing Class, that class must be "open", and any
        functions or properties that you override in that Class must also be declared "open".

        This will only apply to that instance/variable of the class.
     */
    val normalClock = Clock("Red", 20)
    println(normalClock.color())

    /*
        Here, we are initialising an anonymous object called "customClock" from the "Clock" class, and we
        are overriding the color() function. We are also adding a new property called "timezone"

        Since the "Clock" Class has a constructor, we must also pass the appropriate constructor parameters.
        In this example, we pass in "Green" and 100 as the constructor parameters.
    */
    val customClock = object : Clock("Green", 100) {
        var timezone: String? = "AEST"
            set(value) {
                field = value
            }

        override fun color(): String {
            return "No Color!"
        }
    }

    println(customClock.color())
    println(customClock.timezone)
    customClock.timezone = "GMT"
    println(customClock.timezone)
}

public open class Clock(color: String, price: Int) {
    var color: String = color
    var price: Int = price

    open fun color(): String {
        return "The clock has a color of: $color"
    }

    fun price(): String {
        return "The clock cost: $${price}"
    }
}

