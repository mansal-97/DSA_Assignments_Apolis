//Create linked list

data class Node(var data: Int, var next: Node? = null)

class LinkedList {
    private var head: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }
}


fun main() {
    val list = LinkedList()
    list.insert(5)
    list.insert(10)
    list.insert(15)
    list.insert(20)

}