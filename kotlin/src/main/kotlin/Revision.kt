fun main() {
    var h1: House = House("Bricks", 2)
    println(h1.default())
    println(h1.buildingTime())
    println(h1.material())
}

public interface Structure {
    var structure: String

    fun default(): String {
        return "Default Structure"
    }

    fun buildingTime(): String
}

public interface Building: Structure {
    fun material(): String {
        return "Building Default"
    }
}

public interface Example {
    fun material(): String {
        return "Example Default"
    }
}

public class House(var material: String, var levels: Int): Building, Example {
    override var structure: String = "House"

    override fun default(): String {
        return super.default() + " Hello!"
    }

    override fun buildingTime(): String {
        return "House Building Time: 5 Years"
    }

    override fun material(): String {
        return super<Example>.material() + super<Building>.material() + " HELLO"
    }
}