//Find the word with the longest length in the given sentence.

fun findLongestLengthWord(sentence: String): String {
    val word = StringBuffer()
    val longWord = StringBuffer()

    for (ch in sentence) {
        if (ch != ' ') {
            word.append(ch)
        } else {
            if (word.length > longWord.length) {
                longWord.setLength(0)
                longWord.append(word)
            }
            word.setLength(0)
        }
    }
    if (word.length > longWord.length) {
        longWord.setLength(0)
        longWord.append(word)
    }

    return longWord.toString()
}

fun main() {
    val sentence = "Atlantis is a Fictional Island"
    val longest = findLongestLengthWord(sentence)
    println("Longest word in the given sentence: $longest")
}