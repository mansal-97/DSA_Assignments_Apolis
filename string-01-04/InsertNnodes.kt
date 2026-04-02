//Program to insert n nodes at given position in the linked list.

data class Node(var data: Int, var next: Node? = null)

class LinkedList {
    private var head: Node? = null

    fun insertNNodesAtPosition(position: Int, nodes: List<Int>) {
        var newHead: Node? = null
        var newTail: Node? = null

        for (n in nodes) {
            val newNode = Node(n)
            if (newHead == null) {
                newHead = newNode
                newTail = newNode
            } else {
                newTail?.next = newNode
                newTail = newNode
            }
        }

        if (position == 0) {
            newTail?.next = head
            head = newHead
            return
        }

        var temp = head
        var count = 0
        while (temp != null && count < position - 1) {
            temp = temp.next
            count++
        }

        if (temp == null) {
            println("Invalid position")
            return
        }

        newTail?.next = temp.next
        temp.next = newHead
    }

    fun insert(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = newNode
    }

    fun printList() {
        var temp = head
        while (temp != null) {
            print("${temp.data} -> ")
            temp = temp.next
        }
        println("null")
    }
}

fun main() {
    val list = LinkedList()

    list.insert(10)
    list.insert(20)
    list.insert(30)
    list.insert(40)

    println("Initial List:")
    list.printList()

    val newNodes= listOf(100, 200, 300)
    list.insertNNodesAtPosition(3, newNodes)

    println("After insertion of Nodes at given position:")
    list.printList()
}