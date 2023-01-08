package DataStructures

import java.util.Stack

// Similar to Java Stacks
fun main() {

    var names: Stack<String> = Stack()

    // 1. Add to Stack
    names.push("Michael")
    names.push("Adam")
    names.push("Charles")
    names.push("Zion")
    names.push("Xavier")
    names.push("Brian")
    names.push("Danny")

    // 2. Remove from Stack (Last In, First Out) LIFO
    println(names.pop())
    println(names.pop())
    println(names.pop())
//    println(names.pop())
//    println(names.pop())
//    println(names.pop())
//    println(names.pop())

    // 3. Check if Stack Empty
    println(names.isEmpty())
    println(names.isEmpty())

    // 4. Peek top of the Stack
    println(names.peek())
    println(names.peek())

    // 5. Find position from the top of the Stack
    println(names.search("Charles")) // 2
    println(names.search("Michael")) // 4
    println(names.search("Zion")) // 1
}