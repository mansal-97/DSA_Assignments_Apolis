//Program to concat two linked lists.
// E.g. The first list is with data 34, 21, 67, 89, 22 and
// the second list is with data 90, 12, 20, 56, 91 then
// the resultant linked list should be 34, 21, 67, 89, 22, 90, 12, 20, 56, 91.

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

    fun concatenate(list2: LinkedList) {
        if (head == null) {
            head = list2.head
            return
        }
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = list2.head
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
    val list1 = LinkedList()
    val list2 = LinkedList()

    list1.insert(34)
    list1.insert(21)
    list1.insert(67)
    list1.insert(89)
    list1.insert(22)

    list2.insert(90)
    list2.insert(12)
    list2.insert(20)
    list2.insert(56)
    list2.insert(91)

    println("First Linked List:")
    list1.printList()

    println("Second Linked List:")
    list2.printList()

    list1.concatenate(list2)

    println("Concatenated Linked List:")
    list1.printList()
}