//Find the maximum difference between two elements in an array
// such that larger element appears after the smaller number.

fun maxDifference(arr: Array<Int>): Int {
    if (arr.size < 2) {
        return 0
    }

    var minElement = arr[0]
    var maxDiff = arr[1] - arr[0]

    for (i in 1 until arr.size) {
        val diff = arr[i] - minElement
        if (diff > maxDiff) {
            maxDiff = diff
        }

        if (arr[i] < minElement) {
            minElement = arr[i]
        }
    }

    return maxDiff
}

fun main() {
    val arr = arrayOf(2, 3, 10, 6, 4, 8, 1)
    println("Maximum difference: ${maxDifference(arr)}")
}