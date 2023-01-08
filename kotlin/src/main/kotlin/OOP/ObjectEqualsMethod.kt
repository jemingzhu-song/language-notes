package OOP

/* ==================== Object Equals Method ==================== */
/*
    Like Java, Kotlin allows you to override the "equals()" method in Classes to allow you to compare
    Objects to your customisation.
*/

class RubbishBin(type: String) {
    var type: String = type

    override fun equals(other: Any?): Boolean {
        if (other == null) {
            return false
        }
        if (other !is RubbishBin) {
            false
        }
        var rubbishBin: RubbishBin = other as RubbishBin

        if (rubbishBin.type == this.type) {
            println("Equals!")
            return true
        } else {
            return false
        }
    }
}

fun main() {
    var bin1: RubbishBin = RubbishBin("BIG")
    var bin2: RubbishBin = RubbishBin("BIG")
    var bin3: RubbishBin = RubbishBin("SMALL")

    println(bin1.equals(bin2))
    println(bin1.equals(bin3))
}