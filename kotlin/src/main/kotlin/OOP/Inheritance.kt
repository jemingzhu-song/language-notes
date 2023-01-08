package OOP

/* ==================== Inheritance ==================== */
// https://kotlinlang.org/docs/inheritance.html

// Child Constructor use it's Parent's Secondary Constructor
// https://stackoverflow.com/questions/74178992/how-can-i-avoid-a-primary-constructor-call-expected-in-this-case/74179333#74179333
// https://stackoverflow.com/questions/44772936/kotlin-how-can-a-child-constructor-use-its-parents-secondary-constructor
// https://stackoverflow.com/questions/63643672/primary-constructor-call-expected
class Inheritance {
    /* ==================== Inheritance ==================== */
    /*
        All classes in Kotlin have a common superclass, "Any", which is the
        default superclass for a class with no supertypes declared:
    */
    class Example // Implicitly inherits from Any
    /*
        "Any" has three methods:
            .equals()
            .hashCode()
            .toString()
        These methods are therefore defined for all Kotlin classes
    */
    /*
        By default, Kotlin classes are final – they can't be inherited.
        To make a class inheritable, mark it with the "open" keyword
    */
    open class Apple // Class is open for Inheritance

    // To declare an explicit supertype, place the type after a colon in the class header:
    open class Base(p: Int)

    /*
        Since the parent class (the "Base" class) has a primary constructor, the child classes
        must initialise the variables of that primary constructor.
    */
    class Derived(p: Int) : Base(p)

    /*
        If the derived class has a primary constructor, the base class can (and must) be
        initialized in that primary constructor according to its parameters.

        If the derived class has no primary constructor, then each secondary constructor has to
        initialize the base type using the "super" keyword, or it has to delegate to another
        constructor which does. Note that in this case different secondary constructors can
        call different constructors of the base type:
    */
//    class View {
//
//    }
//    class MyView : View {
//        constructor(ctx: Context) : super(ctx)
//
//        constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
//    }

    /* ==================== Overriding Methods ==================== */
    /*
        The "override" modifier is used to override methods. By default, a function/method
        is declared to be "final" (optionally declared with the "final" keyword). In order
        for a method to be able to be over-ridden, you must use the "open" modifier before it.

        The open modifier has no effect when added to members of a final class – a
        class without an open modifier.
    */
    open class Shape {
        open fun draw() { /*...*/ }
        fun fill() { /*...*/ }
    }

    class Circle() : Shape() {
        override fun draw() { /*...*/ }
    }

    /*
        A member marked override is itself open, so it may be overridden in subclasses.
        If you want to prohibit re-overriding, use final:
     */
    open class Rectangle() : Shape() {
        final override fun draw() { /*...*/ }
    }

    /* ==================== Overriding Properties ==================== */
    /*
        The "override" modifier can also be used to override properties/fields of Classes.
        The properties/fields must also have an "open" modifier in order for it to be
        able to be over-ridden.
    */
    open class Shape2 {
        open val vertexCount: Int = 0
    }

    class Rectangle2 : Shape2() {
        override val vertexCount = 4
    }

    /*
        You can also override a val property with a var property, but not vice versa.
        This is allowed because a val property essentially declares a get method, and overriding
        it as a var additionally declares a set method in the derived class.
    */

    /*
        A member marked override is itself open, so it may be overridden in subclasses.
        If you want to prohibit re-overriding, use final:
    */

    open class Rectangle3() : Shape() {
        final override fun draw() { /*...*/ }
    }

    /* ==================== "Super" Keyword ==================== */
    /*
        Code in the derived class (the subclass) can call it's superclass functions and
        property/field getters and setters using the "super" keyword
    */
    open class Rectangle4 {
        open fun draw() { println("Drawing a rectangle") }
        val borderColor: String get() = "black"
    }

    class FilledRectangle : Rectangle4() {
        override fun draw() {
            super.draw()
            println("Filling the rectangle")
        }

        val fillColor: String get() = super.borderColor
    }

    /*
        Inside an inner class, accessing the superclass of the outer class is done using the
        super keyword qualified with the outer class name: super@OuterClassName:
    */
    class FilledRectangle2: Rectangle4() {
        override fun draw() {
            val filler = Filler()
            filler.drawAndFill()
        }

        inner class Filler {
            fun fill() { println("Filling") }
            fun drawAndFill() {
                super@FilledRectangle2.draw() // Calls Rectangle's implementation of draw()
                fill()
                println("Drawn a filled rectangle with color ${super@FilledRectangle2.borderColor}") // Uses Rectangle's implementation of borderColor's get()
            }
        }
    }

    /* ==================== Overriding Rules ==================== */
    /*
        In Kotlin, implementation inheritance is regulated by the following rule: if a class
        inherits multiple implementations of the same member from its immediate superclasses,
        it must override this member and provide its own implementation (perhaps, using one
        of the inherited ones).

        To denote the supertype from which the inherited implementation is taken, use super
        qualified by the supertype name in angle brackets, such as super<Base>:
     */
    open class Rectangle5 {
        open fun draw() { /* ... */ }
    }

    interface Polygon {
        fun draw() { /* ... */ } // interface members are 'open' by default
    }

    class Square() : Rectangle5(), Polygon {
        // The compiler requires draw() to be overridden:
        override fun draw() {
            super<Rectangle5>.draw() // call to Rectangle.draw()
            super<Polygon>.draw() // call to Polygon.draw()
        }
    }
    /*
        It's fine to inherit from both Rectangle and Polygon, but both of them have their
        implementations of draw(), so you need to override draw() in Square and provide a
        separate implementation for it to eliminate the ambiguity.
     */

    /* ==================== Derived Class Initialisation Order ==================== */
    /*
        During the construction of a new instance of a derived class, the base class
        initialization is done as the first step (preceded only by evaluation of the arguments
        for the base class constructor), which means that it happens before the initialization
        logic of the derived class is run.
     */
    open class Base2(val name: String) {

        init { println("Initializing a base class") }

        open val size: Int =
            name.length.also { println("Initializing size in the base class: $it") }
    }

    class Derived2(
        name: String,
        val lastName: String,
    ) : Base2(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

        init { println("Initializing a derived class") }

        override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
    }
    /*
        This means that when the base class constructor is executed, the properties declared
        or overridden in the derived class have not yet been initialized. Using any of those
        properties in the base class initialization logic (either directly or indirectly through
        another overridden open member implementation) may lead to incorrect behavior or a runtime
        failure. When designing a base class, you should therefore avoid using open members in the
        constructors, property initializers, or init blocks.
     */
}