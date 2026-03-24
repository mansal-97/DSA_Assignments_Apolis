//Find the longest subarray with equal number of 0s and 1s.

fun longestSubarray(arr: Array<Int>): Array<Int> {
    val map = HashMap<Int, Int>()
    var sum = 0
    var maxLength = 0
    var start = -1
    var end = -1

    map[0] = -1

    for (i in arr.indices) {
        sum += if (arr[i] == 0) {
            -1
        } else {
            1
        }

        if (map.containsKey(sum)) {
            val prevIndex = map[sum]!!
            val length = i - prevIndex

            if (length > maxLength) {
                maxLength = length
                start = prevIndex + 1
                end = i
            }
        } else {
            map[sum] = i
        }
    }

    if (start == -1) {
        return arrayOf()
    }

    val result = Array(maxLength) { 0 }
    for (i in 0..<maxLength) {
        result[i] = arr[start + i]
    }

    return result
}

fun main() {

    val arr = arrayOf(0, 1, 0, 1, 1, 0, 0, 1, 1)
    val result = longestSubarray(arr)
    println("Longest subarray:")
    println(result.joinToString(" "))
}