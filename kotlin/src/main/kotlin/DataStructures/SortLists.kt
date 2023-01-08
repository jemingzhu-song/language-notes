package DataStructures

/*
    To sort Lists in Kotlin, use the: .sortWith() function (.sortedWith() DOES NOT WORK FOR SOME REASON)

    Similar to Java, you can either:
        1. Pass in a Class that implements the Comparator<Type> method:
            public class sortExample(): Comparator<Type> {

            }

        2. Define an "anonymous" sorting function directly, using the "fun" keyword and "sortWith" ("sortedWith" DOES NOT WORK)
            [listVariable].sortWith(fun (var1: var1Type, var2: var2Type) {
                                        // sorting function body
                                      })
 */

fun main() {
    var people: List<String> = listOf("Michael", "Adam", "Brian", "Charles", "Zion", "Xavier", "Danny")

    println("Before Sorting: $people")

    people.sortedWith(fun (p1: String, p2: String): Int {
        if (p1 == p2) {
            return 0
        } else {
            return p1.compareTo(p2)
        }
    })

    println("After Sorting: $people")
}