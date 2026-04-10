//"Count the number of times a pattern appears in a string as a subsequence
//Input: Text: babgbag, Pattern: bag
// Output: 5"

fun countPatternSubsequence(text: String, pattern: String): Int {
    val n = pattern.length
    val dp = IntArray(n + 1)
    dp[0] = 1

    for (i in text.indices) {
        for (j in n downTo 1) {
            if (text[i] == pattern[j - 1]) {
                dp[j] += dp[j - 1]
            }
        }
    }

    return dp[n]
}
fun main() {
    val text = "babgbag"
    val pattern = "bag"

    val result = countPatternSubsequence(text, pattern)
    println("Output: $result")
}
