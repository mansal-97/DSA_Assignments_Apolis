//Find the longest subarray with at most k distinct elements.

fun longestSubarrayWithKDistinct(arr: Array<Int>, k: Int) {
    val count = HashMap<Int, Int>()
    var left = 0
    var maxLength = 0

    var bestLeft = 0
    var bestRight = 0

    for (right in arr.indices) {
        val num = arr[right]

        val currentCount = count[num]
        if (currentCount == null) {
            count[num] = 1
        } else {
            count[num] = currentCount + 1
        }

        while (count.size > k) {
            val leftNum = arr[left]
            val leftCount = count[leftNum]!!

            if (leftCount == 1) {
                count.remove(leftNum)
            } else {
                count[leftNum] = leftCount - 1
            }
            left++
        }

        val currentLength = right - left + 1
        if (currentLength > maxLength) {
            maxLength = currentLength
            bestLeft = left
            bestRight = right
        }
    }

    println("Max Length: $maxLength")

    val resultSubarray = arr.sliceArray(bestLeft..bestRight)
    println("Subarray: ${resultSubarray.joinToString(", ")}")
}

fun main() {
    val arr = arrayOf(3, 7, 3, 4, 8, 7, 9, 1)
    val k = 3
    longestSubarrayWithKDistinct(arr, k)
}