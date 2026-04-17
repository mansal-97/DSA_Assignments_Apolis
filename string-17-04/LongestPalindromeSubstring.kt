//"Find the longest palindrome substring in a string
//Input: forgeeksskeegfor
//Output: Longest palindrome substring: geeksskeeg"

fun longestPalindromeSubstring(str: String): String {

    var longest = ""

    for (i in str.indices) {
        for (j in i until str.length) {
            val sub = str.substring(i, j + 1)
            if (isPalindrome(sub) && sub.length > longest.length) {
                longest = sub
            }
        }
    }
    return longest
}

fun isPalindrome(str: String): Boolean {
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left] != str[right]) {
            return false
        }
        left++
        right--
    }
    return true
}
fun main() {
    val input = "forgeeksskeegfor"
    val output = longestPalindromeSubstring(input)
    println("Longest palindrome substring: $output")
}