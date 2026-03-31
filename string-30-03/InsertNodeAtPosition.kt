//Program to insert node at given position

data class Node(var data: Int, var next: Node? = null)

class LinkedList {
    private var head: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
    }

    fun insertAtPosition(value: Int, position: Int) {
        val newNode = Node(value)
        if (position == 0) {
            newNode.next = head
            head = newNode
            return
        }

        var current = head
        var count = 0
        while (current?.next != null && count < position - 1) {
            current = current.next
            count++
        }

        newNode.next = current?.next
        current?.next = newNode
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }
}

fun main() {
    val list = LinkedList()

    list.insert(10)
    list.insert(20)
    list.insert(30)
    println("Initial List:")
    list.printList()
    println("\nList after inserting node at position 2:")
    list.insertAtPosition(25, 2)
    list.printList()
    println("\nList after inserting node at position 0:")
    list.insertAtPosition(5, 0)
    list.printList()
}