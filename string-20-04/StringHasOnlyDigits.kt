//"Check if a string contains only digits
//Input: 123456
// Output: Yes, the string contains only digits."

fun isOnlyDigits(text: String): Boolean {
    var count = 0

    for (ch in text) {
        if (ch in '0'..'9') {
            count++
        }
    }

    if (count == text.length) {
        return true
    } else {
        return false
    }
}

fun main() {
    val input = "123456"

    if (isOnlyDigits(input)) {
        println("Yes, the string contains only digits.")
    } else {
        println("No, the string does not contain only digits.")
    }
}