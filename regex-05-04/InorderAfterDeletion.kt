////"Create a Binary Search Tree and delete a given node from the tree.
////Print the inorder traversal after deletion. INPUT----> Enter number of nodes: 7
////Enter elements: 50 30 70 20 40 60 80
////Enter node to delete: 30
////OUTPUT----> Inorder after deletion: 20 40 50 60 70 80"

class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun insert(root: Node?, value: Int): Node {
    if (root == null) {
        return Node(value)
    }

    var currentNode = root

    while (true) {
        if (currentNode != null) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = Node(value)
                    break
                } else {
                    currentNode = currentNode.left!!
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = Node(value)
                    break
                } else {
                    currentNode = currentNode.right!!
                }
            }
        }
    }

    return root
}

fun deleteNode(root: Node?, value: Int): Node? {
    var parentNode: Node? = null
    var nodeToDelete = root
    var rootNode = root

    while (nodeToDelete != null && nodeToDelete.value != value) {
        parentNode = nodeToDelete
        if (value < nodeToDelete.value) {
            nodeToDelete = nodeToDelete.left
        } else {
            nodeToDelete = nodeToDelete.right
        }
    }

    if (nodeToDelete == null) {
        return rootNode
    }

    if (nodeToDelete.left != null && nodeToDelete.right != null) {
        var changeParent = nodeToDelete
        var changeNode = nodeToDelete.right

        while (changeNode?.left != null) {
            changeParent = changeNode
            changeNode = changeNode.left
        }

        nodeToDelete.value = changeNode!!.value
        parentNode = changeParent
        nodeToDelete = changeNode
    }

    val childNode = nodeToDelete.left ?: nodeToDelete.right

    if (parentNode == null) {
        rootNode = childNode
    } else if (parentNode.left == nodeToDelete) {
        parentNode.left = childNode
    } else {
        parentNode.right = childNode
    }

    return rootNode
}

fun inorder(root: Node?) {
    if (root != null) {
        inorder(root.left)
        print("${root.value} ")
        inorder(root.right)
    }
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

    println("Enter node to delete:")
    val valueToDelete = readln().toInt()

    root = deleteNode(root, valueToDelete)

    println("Inorder after deletion:")
    inorder(root)
}