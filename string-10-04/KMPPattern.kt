//"Knuth-Morris-Pratt (KMP) pattern matching algorithm
//Input: Text: abxabcabcaby, Pattern: abcaby
//Output: Pattern found at index 6"

fun createLps(pattern: String): IntArray {
    val lps = IntArray(pattern.length)
    var prev = 0
    var i = 1

    while (i < pattern.length) {
        if (pattern[i] == pattern[prev]) {
            prev++
            lps[i] = prev
            i++
        } else {
            if (prev != 0) {
                prev = lps[prev - 1]
            } else {
                lps[i] = 0
                i++
            }
        }
    }

    return lps
}

fun kmpSearch(text: String, pattern: String) {
    val lps = createLps(pattern)
    var textIndex = 0
    var patternIndex = 0

    while (textIndex < text.length) {
        if (text[textIndex] == pattern[patternIndex]) {
            textIndex++
            patternIndex++
        }

        if (patternIndex == pattern.length) {
            println("Pattern found at index ${textIndex - patternIndex}")
            return
        }

        if (textIndex < text.length && text[textIndex] != pattern[patternIndex]) {
            if (patternIndex != 0) {
                patternIndex = lps[patternIndex - 1]
            } else {
                textIndex++
            }
        }
    }

    println("Pattern not found")
}

fun main() {
    val text = "abxabcabcaby"
    val pattern = "abcaby"
    kmpSearch(text, pattern)
}