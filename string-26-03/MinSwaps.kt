//Find the minimum number of swaps required to sort an array.

fun minSwaps(arr: Array<Int>): Int {
    val n = arr.size
    var swaps = 0

    val sorted = arr.copyOf()
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (sorted[j] > sorted[j + 1]) {
                val temp = sorted[j]
                sorted[j] = sorted[j + 1]
                sorted[j + 1] = temp
            }
        }
    }

    println("Sorted array: ${sorted.joinToString(", ")}")

    val sortedMap = mutableMapOf<Int, Int>()
    for (i in sorted.indices) {
        sortedMap[sorted[i]] = i
    }

    for (i in 0 until n) {
        while (arr[i] != sorted[i]) {
            val index = sortedMap[arr[i]]!!
            val temp = arr[i]
            arr[i] = arr[index]
            arr[index] = temp
            swaps++
        }
    }

    return swaps
}

fun main() {
    val arr = arrayOf(11,8,3,6,2,9)
    println("Minimum swaps required: ${minSwaps(arr)}")
}