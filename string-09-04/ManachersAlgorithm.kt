//"Manacher's algorithm – longest palindrome substring
//Input: abacdfgdcaba
//Output: aba"

fun longestPalindrome(s: String): String {

    val t = StringBuilder()
    t.append("^")
    for (ch in s) {
        t.append("#").append(ch)
    }
    t.append("#$")

    val str = t.toString()
    val p = IntArray(str.length)

    var center = 0
    var right = 0

    for (i in 1 until str.length - 1) {
        val mirror = 2 * center - i

        if (i < right) {
            p[i] = minOf(right - i, p[mirror])
        }

        while (str[i + 1 + p[i]] == str[i - 1 - p[i]]) {
            p[i]++
        }

        if (i + p[i] > right) {
            center = i
            right = i + p[i]
        }
    }

    var maxLen = 0
    var centerIndex = 0

    for (i in 1 until p.size - 1) {
        if (p[i] > maxLen) {
            maxLen = p[i]
            centerIndex = i
        }
    }

    val start = (centerIndex - maxLen) / 2
    return s.substring(start, start + maxLen)
}

fun main() {
    val input = "abacdfgdcaba"
    println("Output: ${longestPalindrome(input)}")
}