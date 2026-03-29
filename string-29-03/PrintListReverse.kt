//Print list data in reverse order using recursive as well as non recursive methods.

data class Node(var data: Int, var next: Node? = null)

class LinkedList {
    private var head: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
        println()
    }

    fun printReverseRecursive() {
        fun printReverse(node: Node?) {
            if (node == null) {
                return
            }
            printReverse(node.next)
            print("${node.data} ")
        }
        printReverse(head)
        println()
    }

    fun printReverseNonRecursive() {
        var current = head
        val values = mutableListOf<Int>()
        while (current != null) {
            values.add(current.data)
            current = current.next
        }
        for (i in values.size - 1 downTo 0) {
            print("${values[i]} ")
        }
        println()
    }
}

fun main() {
    val list = LinkedList()
    list.insert(5)
    list.insert(10)
    list.insert(15)
    list.insert(20)

    println("Original List:")
    list.printList()

    println("Reverse Print (Recursive):")
    list.printReverseRecursive()

    println("Reverse Print (Non-Recursive):")
    list.printReverseNonRecursive()
}