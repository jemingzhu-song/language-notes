package Basics

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val sentence: String = "A quick brown fox jumped over the lazy dog"

    /*
        1. String Variables

        You can use/reference variables in a String by using the "$" operator
    */
    val person01: String = "Michael"
    println("Hello $person01")

    /*
        2. Length of the String: .length

        Syntax:
            [stringVariable].length
     */
    println(sentence.length)

    /*
        3. Convert an Integer to a String: .toString()

        Syntax:
            [integerVariable].toString()
     */
    val num01: Int = 200
    val sNum01: String = num01.toString()
    println(sNum01 is String)

    /*
        4. Convert a String to an Integer: .toIntOrNull()
            .toIntOrNull() parses the string as an Int number and returns it or returns "null"
            if the string is not a valid representation of a number

        Syntax:
            [stringVariable].toIntOrNull()

    */
    val string01: String = "100"
    val iString01: Int? = string01.toIntOrNull()
    if (iString01 != null) {
        println((iString01 + 100))
    }

    /*
        5. Check if String is in a String: .contains()

        Syntax:
            [stringVariable].contains([stringVariable])
    */
    println(sentence.contains("quick")) // true
    println(sentence.contains("quicK")) // false

    /*
        6. Find position of a String in a String: .indexOf()

        Syntax:
            [stringVariable].indexOf([stringVariable])
    */
    println(sentence.indexOf("fox"))
    println(sentence.indexOf("foX"))

    /*
        7. Split a String into multiple Strings: .split()

        Syntax:
            [stringVariable].split([stringVariable])
    */
    var splitted: List<String> = sentence.split(" ")
    println(splitted)

    /*
        8. Join two or more Strings together: .joinToString()

        Syntax:
            [stringVariable].joinToString([separator])
    */
    var toJoin: ArrayList<String> = arrayListOf<String>("Good", "evening", "ladies", "and", "gentleman")
    var joined: String = toJoin.joinToString("---")
    println(joined)

    /*
        9. Compare Strings: .equals() or "=="

        Syntax:
            [stringVariable].equals([stringVariable])
            [stringVariable] == [stringVariable]

    */
    println("apple".equals("apple"))
    println("apple" == "apple")
    println("banana".equals("bana"))
    println("banana" == "bana")

    /*
        10. Compare Strings: .compareTo()

        Syntax:
            [stringVariable].compareTo([stringVariable])
    */
    println("apple".compareTo("frank")) // negative number
    println("custard".compareTo("banana")) // positive number
    println("fitters".compareTo("fat")) // positive number

    /*
        11. Convert all characters to upper or lower case: .uppercase() and .lowercase()

        Syntax:
            [stringVariable].upperCase()
            [stringVariable].lowerCase()
    */
    println(sentence.uppercase())
    println(sentence.lowercase())

    /*
        12. Get all Characters of a String

        Syntax:
            for (<index>> in <stringVariable>.indices) {
                <stringVariable>[<index>]
            }

    */
    for (i in sentence.indices) {
        println(sentence[i])
    }

}