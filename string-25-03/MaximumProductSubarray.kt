//Find the maximum product subarray.

fun maxProductSubarray(arr: Array<Int>): Int {
    var maxEnd = arr[0]
    var minEnd = arr[0]
    var maxSoFar = arr[0]

    for (i in 1 until arr.size) {
        val num = arr[i]

        if (num < 0) {
            val temp = maxEnd
            maxEnd = minEnd
            minEnd = temp
        }

        maxEnd = maxOf(num, maxEnd * num)
        minEnd = minOf(num, minEnd * num)

        maxSoFar = maxOf(maxSoFar, maxEnd)
    }

    return maxSoFar
}

fun main() {
    val arr1 = arrayOf(2, 3, -2, 4)
    println(maxProductSubarray(arr1))
}