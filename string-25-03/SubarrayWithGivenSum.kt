//Find the subarray with given sum.

fun subarrayWithGivenSum(arr: Array<Int>, target: Int): Array<Int> {
    var start = 0
    var currentSum = 0

    for (end in arr.indices) {
        currentSum += arr[end]

        while (currentSum > target && start <= end) {
            currentSum -= arr[start]
            start++
        }

        if (currentSum == target) {
            val length = end - start + 1
            val result = Array(length) { 0 }
            for (i in 0 until length) {
                result[i] = arr[start + i]
            }
            return result
        }
    }

    return arrayOf()
}

fun main() {
    val arr = arrayOf(1, 2, 3, 7, 5,4,2)
    val target = 6
    val result = subarrayWithGivenSum(arr, target)
    println(result.joinToString(","))
}