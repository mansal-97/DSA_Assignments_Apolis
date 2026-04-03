//Program to merge two linked list
// e.g. first list is with data 10, 80, 30, 20, 40, 70 and
// second list with data 75, 25, 95, 23 then
// resultant list should be 10, 75, 80, 25, 30, 95, 20 23, 40, 70.

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

    fun mergeLists(list2: LinkedList): LinkedList {
        val mergedList = LinkedList()
        var first = this.head
        var second = list2.head
        var tail: Node? = null

        while (first != null || second != null) {
            if (first != null) {
                if (mergedList.head == null) {
                    mergedList.head = Node(first.data)
                    tail = mergedList.head
                } else {
                    tail?.next = Node(first.data)
                    tail = tail?.next
                }
                first = first.next
            }

            if (second != null) {
                if (mergedList.head == null) {
                    mergedList.head = Node(second.data)
                    tail = mergedList.head
                } else {
                    tail?.next = Node(second.data)
                    tail = tail?.next
                }
                second = second.next
            }
        }
        return mergedList
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

    list1.insert(10)
    list1.insert(80)
    list1.insert(30)
    list1.insert(20)
    list1.insert(40)
    list1.insert(70)

    list2.insert(75)
    list2.insert(25)
    list2.insert(95)
    list2.insert(23)

    println("First Linked List:")
    list1.printList()

    println("Second Linked List:")
    list2.printList()

    val mergedList = list1.mergeLists(list2)

    println("Linked List after merging two lists:")
    mergedList.printList()
}