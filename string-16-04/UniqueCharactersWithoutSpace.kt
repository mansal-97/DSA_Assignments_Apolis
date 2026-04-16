//"Determine if a string has all unique characters without using extra space
//Input: abcdef //Output: Yes, all characters are unique."

fun hasAllUniqueChars(str: String): Boolean {

    for (i in str.indices) {
        for (j in i + 1 until str.length) {
            if (str[i] == str[j]) {
                return false
            }
        }
    }
    return true
}

fun main() {
    val input = "abcdef"

    if (hasAllUniqueChars(input)) {
        println("Yes, all characters are unique.")
    } else {
        println("No, duplicate characters found or has extra space")
    }
}