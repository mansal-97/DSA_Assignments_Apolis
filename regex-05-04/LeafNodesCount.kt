//"Write a program to create a Binary Search Tree and count how many leaf nodes are present.
//INPUT----> Enter number of nodes: 7
//Enter elements: 50 30 70 20 40 60 80
//OUTPUT----> Leaf nodes: 4"

class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun insert(root: Node?, value: Int): Node {
    if (root == null){
        return Node(value)
    }
    var currentNode = root
    while (true) {
        if (currentNode != null) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = Node(value)
                    break
                }
                currentNode = currentNode.left!!
            } else {
                if (currentNode.right == null) {
                    currentNode.right = Node(value)
                    break
                }
                currentNode = currentNode.right!!
            }
        }
    }
    return root
}

fun countLeafNodes(root: Node?): Int {
    if (root == null) return 0
    if (root.left == null && root.right == null){
        return 1
    }
    return countLeafNodes(root.left) + countLeafNodes(root.right)
}

fun main() {
    var root: Node? = null

    println("Enter number of nodes:")
    val numberOfNodes = readln().toInt()

    println("Enter elements:")
    var i = 0
    while (i < numberOfNodes) {
        val nodeValue = readln().toInt()
        root = insert(root, nodeValue)
        i++
    }

    val leafCount = countLeafNodes(root)
    println("Leaf nodes: $leafCount")
}