//Program to delete a range of nodes from a linked list.

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
        while (current?.next != null) current = current.next
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

    fun deleteRangeOfNodes(startPos: Int, endPos: Int) {

        if (head == null || startPos > endPos) {
            return
        }

        val temp = Node(0)
        temp.next = head

        var prev: Node? = temp
        for (i in 1 until startPos) {
            prev = prev?.next
        }

        var current = prev?.next
        for (i in startPos..endPos){
            current = current?.next
        }

        prev?.next = current
        head = temp.next
    }
}

fun main() {
    val list = LinkedList()
    list.insert(10)
    list.insert(20)
    list.insert(30)
    list.insert(40)
    list.insert(50)
    list.insert(60)

    println("Initial List:")
    list.printList()

    list.deleteRangeOfNodes(2, 4)

    println("After Deleting Range of Nodes:")
    list.printList()
}