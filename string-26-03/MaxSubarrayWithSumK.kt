//Find the maximum length of subarray having sum equal to k.

fun maxSubArrayLen(arr: Array<Int>, k: Int): Int {
    var maxLen = 0
    val n = arr.size

    for (i in 0 until n) {
        var sum = 0
        for (j in i until n) {
            sum += arr[j]
            if (sum == k) {
                val len = j - i + 1
                if (len > maxLen) {
                    maxLen = len
                }
            }
        }
    }

    return maxLen
}

fun main() {
    val arr = arrayOf(5, 8, 6, 9, 2, 7, 1)
    val k = 17
    println("Maximum length of subarray having sum $k:")
    println(maxSubArrayLen(arr, k))
}