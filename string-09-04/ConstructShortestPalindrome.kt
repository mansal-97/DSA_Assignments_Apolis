//". Construct shortest palindrome by adding characters in front of the string
//Input: aacecaaa
//Output: aaacecaaa"

fun isPalindrome(str: String, start: Int, end: Int): Boolean {
    var i = start
    var j = end

    while (i < j) {
        if (str[i] != str[j]) {
            return false
        }
        i++
        j--
    }

    return true
}

fun shortestPalindrome(s: String): String {
    var end = s.length - 1

    while (end >= 0) {
        if (isPalindrome(s, 0, end)) {
            break
        }
        end--
    }

    val suffix = s.substring(end + 1)
    return suffix.reversed() + s
}

fun main() {
    val s = "aacecaaa"
    println("Output:${shortestPalindrome(s)}")
}