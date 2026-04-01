//Program to move a range of nodes to some position in the linked list.

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

    fun moveRangeOfNodes(startPos: Int, endPos: Int, targetPos: Int) {
        if (head == null || startPos > endPos) return

        val temp = Node(0)
        temp.next = head

        var prevStart: Node? = temp
        for (i in 1 until startPos) {
            prevStart = prevStart?.next
        }

        val startNode = prevStart?.next
        var endNode = startNode

        for (i in startPos until endPos){
            endNode = endNode?.next
        }

        val afterEnd = endNode?.next
        prevStart?.next = afterEnd

        var prevTarget: Node? = temp
        var pos = 1
        while (pos < targetPos) {
            prevTarget = prevTarget?.next
            pos++
        }
        endNode?.next = prevTarget?.next
        prevTarget?.next = startNode

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

    list.moveRangeOfNodes(1, 3, 4)

    println("After Moving Range of Nodes:")
    list.printList()
}