//"Toggle each character's case in a string
//Input: HeLLo123
//Output: hEllO123"

fun toggleCase(str: String): String {
    var result = ""

    for (ch in str) {
        if (ch.isUpperCase()) {
            result += ch.lowercaseChar()
        } else if (ch.isLowerCase()) {
            result += ch.uppercaseChar()
        } else {
            result += ch
        }
    }
    return result
}

fun main() {
    val input = "HeLLo123"
    val result = toggleCase(input)
    println("Output: $result")
}