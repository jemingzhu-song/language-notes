package DataStructures

/* ==================== Arrays ==================== */
fun main() {
    /* Arrays */
    /*
        Similar to Java Arrays, Kotlin Arrays also have a FIXED SIZE.
        There are two ways to declare an array:
            1. Using the "arrayOf()" function
            2. Using the "Array(size, initialisationFunction)" constructor

        1. Syntax:
            // Implicit Type Declaration
            var [variableName] = arrayOf(<elem1>, <elem2>, ..., <elemN>)
            // Explicit Type Declaration
            val [variableName]: Array<variableType> = arrayOf<[variableType]>(<elem1>, ... , <elemN>)

        2. Syntax:
            var [variableName] = Array(<arraySize>, <initialisationFunction>)

            For example:
                var numbers = Array(5, {i -> 0}) // Initialise an array of size 5, with all values equal to 0
    */
    val names1: Array<String> = arrayOf<String>("Michael", "Adam", "Jenny", "Kim")

    // 1. Size of the Array
    println(names1.size)

    // 2. Get elements from the Array
    println(names1[2]) // Jenny
    println(names1[3]) // Kim
    println(names1.get(0)) // Michael

    // 3. Edit elements of the Array
    names1.set(0, "MICHAEL")
    names1[2] = "JENNY"
    println("Printing List...")
    for (name in names1) {
        println(name)
    }
    println("End Printing List...")

    // 4. Remove elements from the array
    // You can't remove elements from a Kotlin Array, since Arrays have a fixed size.
}