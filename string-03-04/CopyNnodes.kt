//Program to copy n nodes of first linked list from position p
// to the given destination position in second linked.
// Example: First list elements: 10, 45, 23, 89, 70, 76, 31, 55, 91, 30
// Second list elements: 100, 200, 300, 400, 500, 700
// Copy n = 4 nodes from position 3 from first linked list i.e.
// nodes 23, 89, 70, 76 to the second linked list at position 6.
// Second linked list after copying nodes to second list is 100, 200, 300, 400, 500, 23, 89, 70, 76, 700

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

    fun copyNnodes(list1: LinkedList, p: Int, n: Int, destPos: Int) {
        var list1Temp = list1.head
        var count = 0

        while (list1Temp != null && count < p) {
            list1Temp = list1Temp.next
            count++
        }

        if (list1Temp == null) {
            return
        }

        var copiedHead: Node? = null
        var copiedTail: Node? = null
        var copiedCount = 0

        while (list1Temp != null && copiedCount < n) {
            val newNode = Node(list1Temp.data)

            if (copiedHead == null) {
                copiedHead = newNode
                copiedTail = newNode
            } else {
                copiedTail?.next = newNode
                copiedTail = newNode
            }

            list1Temp = list1Temp.next
            copiedCount++
        }

        if (copiedHead == null) return

        if (destPos == 0) {
            copiedTail?.next = head
            head = copiedHead
            return
        }

        var destTemp = head
        count = 0

        while (destTemp != null && count < destPos - 1) {
            destTemp = destTemp.next
            count++
        }

        if (destTemp == null) return

        copiedTail?.next = destTemp.next
        destTemp.next = copiedHead
    }
}

fun main() {
    val list1 = LinkedList()
    val list2 = LinkedList()

    val data1 = listOf(10, 45, 23, 89, 70, 76, 31, 55, 91, 30)
    val data2 = listOf(100, 200, 300, 400, 500, 700)

    for (d in data1) {
        list1.insert(d)
    }

    for (d in data2) {
        list2.insert(d)
    }

    println("First Linked List:")
    list1.printList()

    println("Second Linked List:")
    list2.printList()

    list2.copyNnodes(list1, p = 2, n = 4, destPos = 5)

    println("Second Linked List After Copying Nodes:")
    list2.printList()
}