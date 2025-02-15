package KotlinSpecific

fun main() {
    var special: String = "Abra Kadabra"

    special.let {
        if (it.length > 1) {
            println("Longer than 1")
        } else {
            println("Empty String")
        }
    }

    var input: Int? = null

    input?.let {
        println("Non-Null Input: $input")
    }
}