//Program to reverse the linked list.

data class Node(var data: Int, var next: Node? = null)

class LinkedList {
    private var head: Node? = null

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

    fun reverse() {
        var prev: Node? = null
        var current = head
        var next: Node?

        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }

        head = prev
    }
}

fun main() {
    val list = LinkedList()

    list.insert(10)
    list.insert(20)
    list.insert(30)
    list.insert(40)
    list.insert(50)

    println("Initial Linked List:")
    list.printList()

    list.reverse()

    println("Reversed Linked List:")
    list.printList()
}