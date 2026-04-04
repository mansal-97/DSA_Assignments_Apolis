//Create a Binary Search Tree and check whether a given key exists in the tree.

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
    val list= mutableListOf<Node>()
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

fun searchKey(root: Node?, key: Int): Boolean {
    var current = root
    while (current != null) {
        if (key == current.value) {
            return true
        } else if (key < current.value) {
            current = current.left
        } else {
            current = current.right
        }
    }
    return false
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
    println()

    println("Enter key to search:")
    val key = readln().toInt()

    if (searchKey(root, key)) {
        println("Key $key exists in the BST.")
    } else {
        println("Key $key does not exist in the BST.")
    }
}