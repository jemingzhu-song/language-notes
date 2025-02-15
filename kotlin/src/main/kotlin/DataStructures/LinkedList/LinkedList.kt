package DataStructures.LinkedList

class ListNode(
    var value: Int,
    var next: ListNode? = null
)

fun main() {
    // Build LinkedList
    var head = ListNode(2)

    var values = listOf(5, 12, 85, 35, 1, 23)
    var curr: ListNode? = head
    for (v in values) {
        curr?.next = ListNode(v)
        curr = curr?.next
    }

    // Print LinkedList
    var currNode: ListNode? = head
    while (currNode?.value != null) {
        println(currNode?.value)
        currNode = currNode?.next
    }
}