
//Find the largest subarray with equal number of 0s and 1s.

fun largestSubarray(arr: Array<Int>): Array<Int> {
    val map = HashMap<Int, Int>()
    var sum = 0
    var maxLength = 0
    var start = -1

    map[0] = -1

    for (i in arr.indices) {
        val value = arr[i]

        if (value == 0 || value == 1) {
            if (value == 0) {
                sum += -1
            } else {
                sum += 1
            }

            if (map.containsKey(sum)) {
                val prevIndex = map[sum]!!
                val length = i - prevIndex
                if (length > maxLength) {
                    maxLength = length
                    start = prevIndex + 1
                }
            } else {
                map[sum] = i
            }
        }
    }

    if (start == -1) return arrayOf()

    val result = Array(maxLength) { 0 }
    for (i in 0 until maxLength) {
        result[i] = arr[start + i]
    }

    return result
}

fun main() {
    val arr = arrayOf(1, 0, 0, 1, 1, 1, 0, 1,1,0,1)
    val result = largestSubarray(arr)
    println(result.joinToString(","))
}