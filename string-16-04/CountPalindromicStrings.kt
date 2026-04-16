//" Count number of palindromic substrings in a string
//Input: aaa
//Output: 6 (a, a, a, aa, aa, aaa)"

fun countPalindromicSubstrings(str: String): Int {
    var count = 0

    print("(")

    for (i in str.indices) {
        for (j in i until str.length) {
            if (palindrome(str, i, j)) {
                if (count > 0) {
                    print(", ")
                }
                print(str.substring(i, j + 1))
                count++
            }
        }
    }

    print(")")
    println()

    return count
}

fun palindrome(str: String, leftStart: Int, rightStart: Int): Boolean {
    var left = leftStart
    var right = rightStart

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
    val input = "aaa"
    val result = countPalindromicSubstrings(input)

    println("Output: $result")
}