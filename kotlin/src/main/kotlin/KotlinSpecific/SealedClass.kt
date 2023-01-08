package KotlinSpecific

/* ==================== Sealed Classes ==================== */
// https://www.programiz.com/kotlin-programming/sealed-class
/*
    Sealed classes are used when a value can have only one of the types from a limited set (restricted hierarchies).
    Sealed classes restricts the possibility of creating subclasses.

    To create a sealed class, you use the "sealed" keyword:

        sealed class Person {

        }

    Before going into details about sealed classes, let's explore what problem they solve. For example:
*/

open class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

/*
    In the above program, the base class Expr has two derived classes Const (represents a number) and Sum
    (represents sum of two expressions). Here, it's mandatory to use else branch for default condition
    in when expression.

    Now, if you derive a new subclass from Expr class, the compiler won't detect anything as else branch
    handles it which can lead to bugs. It would have been better if the compiler issued an error when we
    added a new subclass.

    To solve this problem, you can use sealed class. As mentioned, sealed class restricts the possibility of
    creating subclasses. And, when you handle all subclasses of a sealed class in an "when" expression, it's not
    necessary to use else branch.

    NOTE: Sealed Classes only throw errors when used in a "when" statement ONLY (Doesn't work in an If-Else Statement)
 */

// Here's how you can solve the above problem using sealed class:

sealed class Expr1
class Const1(val value: Int) : Expr1()
class Sum1(val left: Expr1, val right: Expr1) : Expr1()
// Uncommenting this line below will cause the compiler to complain in the "when" statement in the eval() function below
// class Another1() : Expr1()


fun eval1(e: Expr1): Int =
    when (e) {
        is Const1 -> e.value
        is Sum1 -> eval1(e.right) + eval1(e.left)

    }

/*
    As you can see, there is no else branch. If you derive a new subclass from Expr class,
    the compiler will complain unless the subclass is handled in the "when" expression.
*/

/*
    Few Important Notes
        • All subclasses of a sealed class must be declared in the same file where sealed class is declared.
        • A sealed class is abstract by itself, and you cannot instantiate objects from it.
        • You cannot create non-private constructors of a sealed class; their constructors are private by default.
*/

/* ========== Sealed Class Alternative Declaration ========== */
/*
    Since all subclasses of a sealed class must be declared in the same file where the sealed class is declared,
    we can "nest" the subclasses inside the sealed class declaration
*/
sealed class Enemy() {

    /* Don't forget to Inherit the Parent Class (i.e. the "Enemy" class) */
    class Soldier(val ability: String): Enemy() {
        fun attack() {
            println("Soldier Attack!")
        }
        // class body
    }

    /* Don't forget to Inherit the Parent Class (i.e. the "Enemy" class) */
    class Tank(val ability: String): Enemy() {
        fun attack() {
            println("Tank Attack!")
        }

        fun special() {
            println("Special Ability Tank")
        }
    }

    /* Don't forget to Inherit the Parent Class (i.e. the "Enemy" class) */
    class Commander(val ability: String, lives: Int): Enemy() {
        // class body
    }
}

fun main() {

}