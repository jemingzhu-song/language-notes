package DataStructures

import java.util.PriorityQueue

fun main() {
    var people: PriorityQueue<String> = PriorityQueue()

    people.add("Charles")
    people.add("Brian")
    people.add("Xavier")
    people.add("Zion")
    people.add("Danny")
    people.add("Adam")

    // PriorityQueue automatically removes by default lexographical/accending order
    println(people.remove())
    println(people.remove())
    println(people.remove())
    println(people.remove())
    println(people.remove())
    println(people.remove())

    println(people.isEmpty()) // Check if Empty

    var foods: PriorityQueue<String> = PriorityQueue(fun(f1: String, f2: String): Int {
        if (f1 == f2) {
            return 0
        } else {
            return f1.compareTo(f2) * -1
        }
    })

    foods.add("Apple")
    foods.add("Banana")
    foods.add("Pear")
    foods.add("Zucchini")
    foods.add("Capsicum")
    foods.add("Yam")
    foods.add("Durian")

    // PriorityQueue custom removal
    println(foods.remove())
    println(foods.remove())
    println(foods.remove())
    println(foods.remove())
    println(foods.remove())
    println(foods.remove())
    println(foods.remove())

}