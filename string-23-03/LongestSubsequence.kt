//Find the longest increasing subsequence in an array.

fun longestIncreasingSubsequence(nums: Array<Int>) {

    val n = nums.size
    val dp = Array(n) { 1 }
    val prev = Array(n) { -1 }

    for (i in 1 until n) {
        for (j in 0 until i) {
            if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1
                prev[i] = j
            }
        }
    }

    var maxLength = 0
    var lastIndex = 0
    for (i in dp.indices) {
        if (dp[i] > maxLength) {
            maxLength = dp[i]
            lastIndex = i
        }
    }

    val lis = mutableListOf<Int>()
    var index = lastIndex
    while (index != -1) {
        lis.add(nums[index])
        index = prev[index]
    }
    lis.reverse()
    println("longest increasing subsequence: $lis")
}

fun main() {
    val arr = arrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    longestIncreasingSubsequence(arr)
}