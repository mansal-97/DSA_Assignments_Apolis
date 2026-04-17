//"Check if two strings are equal ignoring case
//Input: Hello, HELLO
// Output: Yes, the strings are equal ignoring case."

fun areEqualIgnoreCase(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    for (i in str1.indices) {
        if (str1[i].lowercaseChar() != str2[i].lowercaseChar()) {
            return false
        }
    }
    return true
}

fun main() {
    val str1 = "Hello"
    val str2 = "HELLO"

    if (areEqualIgnoreCase(str1, str2)) {
        println("Yes, the strings are equal ignoring case.")
    } else {
        println("No, the strings are not equal.")
    }
}