//" Implement regular expression matching (. and *)
//Input: Text: aab, Pattern: c*a*b
// Output: True"

fun isRegexMatch(input: String, pattern: String): Boolean {
    if (pattern.isEmpty()) {
        return input.isEmpty()
    }

    val firstChar = input.isNotEmpty() && (input[0] == pattern[0] || pattern[0] == '.')

    if (pattern.length >= 2 && pattern[1] == '*') {
        return isRegexMatch(input, pattern.substring(2)) ||
                (firstChar && isRegexMatch(input.substring(1), pattern))
    }

    return firstChar && isRegexMatch(input.substring(1), pattern.substring(1))
}

fun main() {
    val input = "aab"
    val pattern = "c*a*b"
    println("Output: ${isRegexMatch(input, pattern)}")
}