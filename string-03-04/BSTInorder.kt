//"Write a program to create a Binary Search Tree (BST) by inserting N integer values.
// After inserting all elements, print the Inorder traversal of the tree.
// INPUT-----> Enter number of nodes:5
//Enter elements:50 30 70 20 40
//OUTPUT ----Inorder Traversal:20 30 40 50 70"

class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun insertNode(root: Node?, value: Int): Node {
    val newNode = Node(value)
    if (root == null) {
        return newNode
    }

    var current = root
    var parent: Node? = null

    while (current != null) {
        parent = current
        if (value < current.value) {
            current = current.left
        } else {
            current = current.right
        }
    }

    if (value < parent!!.value) {
        parent.left = newNode
    } else {
        parent.right = newNode
    }

    return root
}

fun printInorder(root: Node?) {
    val list = mutableListOf<Node>()
    var current = root

    while (current != null || list.isNotEmpty()) {
        while (current != null) {
            list.add(current)
            current = current.left
        }

        current = list.removeAt(list.size - 1)
        print("${current.value} ")
        current = current.right
    }
}

fun main() {
    var root: Node? = null

    println("Enter number of nodes:")
    val n = readln().toInt()

    println("Enter elements:")
    for (i in 1..n) {
        val value = readln().toInt()
        root = insertNode(root, value)
    }

    print("Inorder Traversal: ")
    printInorder(root)
}