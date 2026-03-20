//Rotate an array to the right by n positions.

fun rotateRight(arr: Array<Int>, n: Int): Array<Int> {
    val size = arr.size
    val result = Array(size) { 0 }

    val rotate = n % size

    for (i in arr.indices) {
        val index = (i + rotate) % size
        result[index] = arr[i]
    }

    return result
}

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val n = 2

    val result = rotateRight(arr, n)
    println("Array after rotating right by $n positions:")
    for (num in result) {
        print("$num ")
    }
}