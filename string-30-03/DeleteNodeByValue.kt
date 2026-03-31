//Program to delete a node by value.

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

    fun deleteNodeByValue(value: Int) {
        if (head == null){
            return
        }
        if (head?.data == value) {
            head = head?.next
            return
        }

        var current = head
        var prev: Node? = null

        while (current != null && current.data != value) {
            prev = current
            current = current.next
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

    println("List before deleting nodes:")
    list.printList()

    println("\nDelete node with value 30:")
    list.deleteNodeByValue(30)
    list.printList()

    println("\nDelete node with value 10 :")
    list.deleteNodeByValue(10)
    list.printList()
}