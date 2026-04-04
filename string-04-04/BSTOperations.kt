//"Program to create Binary Search Tree and implement following operations on it.
//-> Search an element in Binary Tree
//-> Find greatest element from the BST
//-> Find smallest element from the BST
//-> Traverse the tree using In-order, Preorder and
//Post order tree traversal method to print data in tree (Recursive and Non-Recursive)
//-> Find height of the tree

class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun insertNode(root: Node?, value: Int): Node {
    if (root == null) {
        return Node(value)
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
        parent.left = Node(value)
    } else {
        parent.right = Node(value)
    }

    return root
}

fun searchKey(root: Node?, key: Int): Boolean {
    var current = root
    while (current != null) {
        if (key == current.value) {
            return true
        }
        else if (key < current.value) {
            current = current.left
        }
        else {
            current = current.right
        }
    }
    return false
}

fun findMin(root: Node?): Int? {
    if (root == null) {
        return null
    }
    var current = root
    while (current?.left != null) {
        current = current.left!!
    }
    return current?.value
}

fun findMax(root: Node?): Int? {
    if (root == null) {
        return null
    }
    var current = root
    while (current?.right != null) {
        current = current.right!!
    }
    return current?.value
}

fun inorderRecursive(root: Node?) {
    if (root != null) {
        inorderRecursive(root.left)
        print("${root.value} ")
        inorderRecursive(root.right)
    }
}

fun preorderRecursive(root: Node?) {
    if (root != null) {
        print("${root.value} ")
        preorderRecursive(root.left)
        preorderRecursive(root.right)
    }
}

fun postorderRecursive(root: Node?) {
    if (root != null) {
        postorderRecursive(root.left)
        postorderRecursive(root.right)
        print("${root.value} ")
    }
}

fun inorderIterative(root: Node?) {
    val stack = mutableListOf<Node>()
    var current = root
    while (current != null || stack.isNotEmpty()) {
        while (current != null) {
            stack.add(current)
            current = current.left
        }
        current = stack.removeAt(stack.size - 1)
        print("${current.value} ")
        current = current.right
    }
}

fun preorderIterative(root: Node?) {
    if (root == null) {
        return
    }
    val stack = mutableListOf<Node>()
    stack.add(root)
    while (stack.isNotEmpty()) {
        val node = stack.removeAt(stack.size - 1)
        print("${node.value} ")
        if (node.right != null) {
            stack.add(node.right!!)
        }
        if (node.left != null) {
            stack.add(node.left!!)
        }
    }
}

fun postorderIterative(root: Node?) {
    if (root == null) {
        return
    }
    val list1 = mutableListOf<Node>()
    val list2 = mutableListOf<Node>()

    list1.add(root)
    while (list1.isNotEmpty()) {
        val node = list1.removeAt(list1.size - 1)
        list2.add(node)
        if (node.left != null) {
            list1.add(node.left!!)
        }
        if (node.right != null){
            list1.add(node.right!!)
        }
    }

    while (list2.isNotEmpty()) {
        print("${list2.removeAt(list2.size - 1).value} ")
    }
}

fun height(root: Node?): Int {
    if (root == null) {
        return 0
    }
    val leftHeight = height(root.left)
    val rightHeight = height(root.right)
    val maxHeight: Int
    if (leftHeight > rightHeight) {
        maxHeight = leftHeight
    } else {
        maxHeight = rightHeight
    }
    val totalHeight = 1 + maxHeight
    return totalHeight
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

    println("\nRecursive Traversals:")
    print("Inorder: ")
    inorderRecursive(root)
    println()
    print("Preorder: ")
    preorderRecursive(root)
    println()
    print("Postorder: ")
    postorderRecursive(root)
    println()

    println("\nIterative Traversals:")
    print("Inorder: ")
    inorderIterative(root)
    println()
    print("Preorder: ")
    preorderIterative(root)
    println()
    print("Postorder: ")
    postorderIterative(root)
    println()

    println("\nHeight of tree: ${height(root)}")
    println("Smallest element: ${findMin(root)}")
    println("Greatest element: ${findMax(root)}")

    println("Enter key to search:")
    val key = readln().toInt()
    if (searchKey(root, key)) {
        println("Key $key exists in the BST.")
    }
    else{
        println("Key $key does not exist in the BST.")
    }
}