package HelpfulNotes

/*
    Kotlin also has a Java equivalent .forEach(), .filter() and other functions, which we can chain together
*/

fun main() {
    var names: MutableList<String> = mutableListOf("Michael", "Adam", "Kenny", "Charles", "Brian", "Zion", "Xavier")

    names
        .filterNotNull()
        .filter { name -> name.contains("e") }
        .forEach { name -> println(name) }

    var filtered: List<String> = names
                                    .filterNotNull()
                                    .filter { name -> name.contains("e") }
                                    .map { name: String -> "$name!!!" }
                                    .toList()
    println(filtered)

}