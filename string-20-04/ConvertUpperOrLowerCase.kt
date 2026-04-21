//"Convert a string to uppercase/lowercase without using built-in methods
//Input: HeLLo
// Output (Lowercase): hello
// Output (Uppercase): HELLO"

fun toLowerCase(text: String): String {
    var result = ""

    for (ch in text) {
        if (ch in 'A'..'Z') {
            result += (ch + 32)
        } else {
            result += ch
        }
    }

    return result
}

fun toUpperCase(text: String): String {
    var result = ""

    for (ch in text) {
        if (ch in 'a'..'z') {
            result += (ch - 32)
        } else {
            result += ch
        }
    }

    return result
}

fun main() {
    val input = "HeLLo"

    val lower = toLowerCase(input)
    val upper = toUpperCase(input)

    println("Lowercase: $lower")
    println("Uppercase: $upper")
}