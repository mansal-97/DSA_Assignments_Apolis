//Find the peak element in an array (an element which is greater than or equal to its neighbors).

fun peakElement(arr: Array<Int>): List<Int> {
    val peaks = mutableListOf<Int>()
    val n = arr.size
    var i = 0

    while (i < n) {
        val left: Int
        val right: Int

        if (i == 0) {
            left = arr[i]
        } else {
            left = arr[i - 1]
        }

        if (i == n - 1) {
            right = arr[i]
        } else {
            right = arr[i + 1]
        }

        if (arr[i] >= left) {
            if (arr[i] >= right) {
                peaks.add(arr[i])
            }
        }

        i += 1
    }

    return peaks
}

fun main() {
    val arr = arrayOf(5, 2, 11, 21, 7, 9, 1)
    val peaks = peakElement(arr)
    println("All peak elements are: $peaks")
}