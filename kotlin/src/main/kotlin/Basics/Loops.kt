package Basics

fun main() {
    val names = arrayOf<String>("Michael", "Adam", "Charles", "Zion", "Kenny")

    /*
        1. "for" Loop

        Uses the "in" statement (similar to a for loop in Python)

        Syntax:
            for (<item> in <collection> { }

        Syntax:
            for (<item>: <dataType> in <collection> { }
    */

    for (name in names) {
        println(name)
    }

    for (name: String in names) {

    }

    /*
        2. "forEach" loop (available for the Collections library)

        Similar to a .stream().forEach() in Java, except it does not require
        parantheses () around the function {}
     */
    names.forEach { name ->
        val modified: String = name + "!!!"
        println(modified)
    }

    /*
        3. "forEachIndexed" loop (available for the Collections library)

        Same as the .forEach loop, but also gives you the index of each element

        Syntax:
            .forEachIndexed { index, elementName ->
                // code block
            }
    */
    names.forEachIndexed {index, name ->
        println("$name is at index: $index")
    }

    /*
        4. "for" loop with indices

        Similar to a for (int i = 0; i < [collection].length; i++) { } in Java

        Syntax:
            for (<index> in <collection>.indices) { }
    */
    for (index in names.indices) {
        println(names[index])
    }

    /*
        5. "for" loop with indices in a range

        Similar a for (int i = 0; i < [rangeInt]; i++) { } in Java but with a range

        Syntax:
            for (<index> in <startInt>..<endInt>) { }
     */
    for (index in 0..2) {
        println(names[index])
    }
}