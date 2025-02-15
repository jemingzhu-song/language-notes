package KotlinOperatorsAndFunctions

/*
    .count { predicate }

    .count{} function returns an integer that represents the number of elements matching
    the given predicate
*/

fun main() {
    val list1 = listOf(24, 6, 44, 10, 3, 8, 9)
    val result = list1.count{ it % 2 == 0 }
    print(result)
}