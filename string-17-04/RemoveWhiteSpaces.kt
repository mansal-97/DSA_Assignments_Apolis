//" Remove all whitespaces from a string Input: A B C D Output: ABCD"

fun removeSpaces(str: String): String {
    var result = ""

    for (ch in str) {
        if (ch != ' ') {
            result += ch
        }
    }
    return result
}

fun main() {
    val input = "A B C D"
    val output = removeSpaces(input)
    println("Output: $output")
}