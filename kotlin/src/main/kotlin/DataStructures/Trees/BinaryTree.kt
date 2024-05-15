package DataStructures.Trees

class TreeNode(
    var value: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
) {
    fun insertTreeNodeInternal(head: TreeNode?, value: Int) {
        // Same as external function
    }
}

fun insertTreeNode(head: TreeNode?, value: Int): TreeNode {
    if (head == null) {
        return TreeNode(value)
    }

    if (value < head!!.value) {
        // Insert in Left Child
        head?.left = insertTreeNode(head?.left, value)
    } else { // value > head!!.value
        // Insert in Right Child
        head?.right = insertTreeNode(head?.right, value)
    }

    return head
}

fun search(head: TreeNode?, key: Int): TreeNode? {
    // Base Case
    if (head?.value == key || head == null) {
        return head
    }

    if (key < head!!.value) {
        // Search in Left Child
        return search(head.left, key)
    } else {
        // Search in Right Child
        return search(head.right, key)
    }
}

fun printTreeInOrder(head: TreeNode?) {
    if (head != null) {
        printTreeInOrder(head?.left)
        println(head?.value)
        printTreeInOrder(head?.right)
    }
}

fun main() {
    var head = TreeNode(10)
    // Insert into Binary Tree
    insertTreeNode(head, 2)
    insertTreeNode(head, 15)
    insertTreeNode(head, 4)
    insertTreeNode(head, 3)
    insertTreeNode(head, 18)
    insertTreeNode(head, 13)
    insertTreeNode(head, 99)
    insertTreeNode(head, -100)
    insertTreeNode(head, 50)

    printTreeInOrder(head)

    // Search in Binary Tree
    println("=============== Searching in Binary Tree ===============")
    println(search(head, 4)?.value)
    println(search(head, 99)?.value)
    println(search(head, 999999)?.value)
}