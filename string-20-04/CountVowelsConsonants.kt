//"Count vowels and consonants in a string
//Input: Hello World
// Output: Vowels: 3, Consonants: 7"

fun countVowelsAndConsonants(text: String) {
    var vowels = 0
    var consonants = 0

    for (ch in text.lowercase()) {
        if (ch in 'a'..'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++
            } else {
                consonants++
            }
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
}

fun main() {
    val input = "Hello World"

    countVowelsAndConsonants(input)
}