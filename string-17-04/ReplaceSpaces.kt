//"Replace all spaces in a string with %20
//Input: Mr John Smith
// Output: Mr%20John%20Smith"

fun replaceSpaces(str: String): String {
    var result = ""

    for (ch in str) {
        if (ch == ' ') {
            result += "%20"
        } else {
            result += ch
        }
    }
    return result
}

fun main() {
    val input = "Mr John Smith"
    val output = replaceSpaces(input)
    println("Output: $output")
}