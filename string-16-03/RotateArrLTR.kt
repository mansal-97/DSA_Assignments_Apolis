//Rotate array elements from left to right by n position.

fun rotateArrayLTR(arr: Array<Int>, n: Int) {
    val size = arr.size
    val k = n % size
    var count = 0
    var start = 0

    while (count < size) {
        var current = start
        var prev = arr[start]

        while (true) {
            val next = (current + k) % size
            val temp = arr[next]
            arr[next] = prev
            prev = temp
            current = next
            count++

            if (current == start) {
                break
            }
        }

        start++
    }

    println(arr.joinToString())
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    rotateArrayLTR(arr, 2)
}