//"Check if a string is a pangram
//Input: The quick brown fox jumps over a lazy dog
// Output: Yes, the string is a pangram."

fun isPangram(text: String): Boolean {
    val set = HashSet<Char>()
    for (ch in text.lowercase()) {
        if (ch in 'a'..'z') {
            set.add(ch)
        }
    }

    return set.size == 26
}

fun main() {
    val input = "The quick brown fox jumps over a lazy dog"

    if (isPangram(input)) {
        println("Yes, the string is a pangram.")
    } else {
        println("No, the string is not a pangram.")
    }
}