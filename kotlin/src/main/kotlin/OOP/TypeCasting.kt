package OOP

/* ==================== Type Casting and Type Checking ==================== */
fun main() {
    /*
        To check whether a Class is an instance of another Class, you use the "is" keyword
    */
    var computer: Computer = Computer("Laptop", 10, 1200)
    var washingMachine: WashingMachine = WashingMachine("Appliance", 50)
    var basketball: Basketball = Basketball(7)

    println(computer is Electronic)
    println(washingMachine is Electronic)

    /*
        To type-cast a Class, we use the "as" keyword
    */
    var pencil: Stationary = Pencil()
    // println(pencil.pencil()) // Doesn't work, because not casted into a "Pencil" type
    var pencilCasted: Pencil = pencil as Pencil
    pencilCasted.pencil() // This works, because it has been type-casted

    /*
        Kotlin also offers Smart-Casting, which assumes a class is of a type if you use an
        if-statement that checks the type
    */
    var notebook: Stationary = Notebook()
    if (notebook !is Notebook) {
        println("Not Notebook Type!")
    } else {
        /*
            This is an example of Smart-Casting, because in this "else" block, we know that the
            type of "notebook" must be of a Notebook type. Hence, we don't need to explicitly
            cast this into a Notebook type.
        */
        notebook.notebook()
    }

}

open class Electronic(type: String) {
    var type: String = type
}

public class Computer(type: String, ram: Int, resolution: Int): Electronic(type) {
    var ram: Int = ram
    var resolution: Int = resolution
}

public class WashingMachine(type: String, capacity: Int): Electronic(type) {
    var capacity: Int = capacity
}

public class Basketball(size: Int) {
    var size: Int = size
}

public interface Stationary {
    fun stationary()
}

public class Pencil: Stationary {
    override fun stationary() {
        println("Stationary: Pencil")
    }

    fun pencil() {
        println("Pencil!")
    }
}

public class Notebook: Stationary {
    override fun stationary() {
        println("Stationary: Notebook")
    }

    fun notebook() {
        println("Notebook!")
    }
}