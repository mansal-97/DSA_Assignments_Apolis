//Program to delete a node by position.

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

    fun deleteNodeByPosition(position: Int) {
        if (head == null) {
            return
        }
        if (position == 0) {
            head = head?.next
            return
        }
        var current = head
        var prev: Node? = null
        var count = 0
        while (current != null && count < position) {
            prev = current
            current = current.next
            count++
        }
        if (current == null) return
        prev?.next = current.next
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
    list.insert(50)

    println("List Before deleting node:")
    list.printList()

    println("\nAfter Deleting node at position 2:")
    list.deleteNodeByPosition(2)
    list.printList()
    println("\nAfter Deleting node at position 0:")
    list.deleteNodeByPosition(0)
    list.printList()

}