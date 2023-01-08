package OOP

/* ==================== Interfaces ==================== */

fun main() {
    var basicInfoProvider: BasicInfoProvider = BasicInfoProvider()

    // Foods
    var banana: Food = Food(200, 20, 5, 3)
    var steak: Food = Food(500, 25, 25, 18)
    var chocolate: Food = Food(400, 30, 2, 21)

    basicInfoProvider.printInfo(banana)
    basicInfoProvider.uniqueInfo(banana)

}

/*
    The fields/properties and functions/methods in a Kotlin Interface are all assumed to be "open", and can be
    over-ridden. Therefore, you don't need an "open" keyword as it is already assumed.

    Additionally, functions/methods in Interfaces can also contain a body! This will be the "default implementation"
    of the method if it is defined in the Interface.
*/
public interface FoodInfoProvider {
    /*
        Interfaces can also contain properties/fields. However, you cannot initialise these properties/fields in the
        Interface itself. It must be overridden in the classes that implement this Interface. However, any reference
        to this property/field within this interface itself (i.e. in a method body of this interface) will reference
        the value of this property which was overridden/implemented in the class that implemented this interface.
    */
    val providerInfo : String
    /*
        Since this method in this FoodInfoProvider Interface has a method body, this method body will be the
        "default implementation". This means classes which implement this Interface don't necessarily have to
        override or implement this method since a "default implementation" already exists
    */
    fun printInfo(food: Food) {
        println(food.getInfo())
    }

    /*
        Since this method in this FoodInfoProvider Interface does NOT have a method body, it must be
        implemented/overridden by classes that implement this Interface
     */
    fun uniqueInfo(food: Food)
}

/*
    In Kotlin, to implement an interface, you use the ":" operator (similar to how you extend classes).
*/
// This "BasicInfoProvider" class implements the "PersonInfoProvider" interface
public class BasicInfoProvider : FoodInfoProvider {

    /*
        You must implement/override this property/field of this interface.
    */
    override val providerInfo: String
        get() = "BasicInfoProvider"

    /*
        Since the printInfo() function already has a default implementation defined in the Interface itself,
        there is no need to override or implement this method if you don't want to.
    */

    override fun uniqueInfo(food: Food) {
        println("BasicInfoProvider: " + food.getInfo())
    }

}

public class Food (calories: Int, carbohydrates: Int, protein: Int, fat: Int) {
    var calories: Int = calories
    var carbohydrates: Int = carbohydrates
    var protein: Int = protein
    var fat: Int = fat

    fun getInfo(): String {
        return "Calories: $calories | Carbohydrates: ${carbohydrates}g |Protein: ${protein}g | Fat: ${fat}g"
    }
}

/* ==================== Implementing Multiple Interfaces ==================== */
interface Shoe {
    fun shoe()
}

interface Footwear {
    fun footwear()
}

/*
    To implement multiple interfaces, you can just use a comma "," to separate the
    different interfaces you wish to implement (similar to Java)
*/
public class Runners: Shoe, Footwear {
    override fun shoe() {
        println("Runners: Shoe!")
    }

    override fun footwear() {
        println("Runners: Footwear!")
    }
}

/* ==================== Implementing Multiple Interfaces - Overriding Conflicts ==================== */
/*
    Suppose, two interfaces(A and B) have a non-abstract method with the same name (let's say callMe() method).
    You implemented these two interfaces in a class (let's say C). Now, if you call the callMe() method
    using the object of class C, compiler will throw error. For example:
 */
interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B  {
    fun callMe() {
        println("From interface B")
    }
}

class C: A, B {
    /*
        To solve this issue, you need to override this implementation (since callMe() is defined in both
        Interface "A" and Interface "B").

        You can use the "<>" operator to specify which "super" function you are calling.
        In the example below...
            super<A>.callMe() - refers to the callMe() function defined in Interface "A"
            super<B>.callMe() - refers to the callMe() function defined in Interface "B"
    */
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}

/* ==================== Extending Interfaces ==================== */
/*
    Like Java, you can also extend Interfaces in Kotlin, but just using the ":" notation on an Interface to
    extend it to another Interface. Interfaces can also extend multiple other Interfaces.
*/
interface Foundation {
    fun foundation(): String
}

interface Structure {
    fun structure(): String
}

interface Building: Structure, Foundation{
    fun material(): String
}

public class House: Building {
    override fun material(): String {
        TODO("Not yet implemented")
    }

    override fun structure(): String {
        TODO("Not yet implemented")
    }

    override fun foundation(): String {
        TODO("Not yet implemented")
    }

}