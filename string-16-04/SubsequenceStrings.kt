//"Check if one string is a subsequence of another
//Input:
// String1: ace
// String2: abcde
// Output: Yes, 'ace' is a subsequence of 'abcde'"

fun isSubsequence(str1: String, str2: String): Boolean {
    var i = 0
    var j = 0

    while (i < str1.length && j < str2.length) {
        if (str1[i] == str2[j]) {
            i++
        }
        j++
    }

    return i == str1.length
}

fun main() {
    val str1 = "ace"
    val str2 = "abcde"

    if (isSubsequence(str1, str2)) {
        println("Yes, '$str1' is a subsequence of '$str2'")
    } else {
        println("No, not a subsequence")
    }
}