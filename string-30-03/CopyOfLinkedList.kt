//Program to create a copy of a given linked list.

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

    fun copyOfLinkedList(): LinkedList {
        val newList = LinkedList()
        var current = head
        while (current != null) {
            newList.insert(current.data)
            current = current.next
        }
        return newList
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
    list.insert(40)

    println("Linked List:")
    list.printList()

    val copiedList = list.copyOfLinkedList()
    println("Copy of given Linked List:")
    copiedList.printList()
}