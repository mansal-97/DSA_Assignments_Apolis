//Print all permutations of a given string

fun permutations(str: String, prefix: String = "") {
    if (str.isEmpty()) {
        println(prefix)
        return
    }
    for (i in 0..<str.length) {
        val remaining = str.substring(0, i) + str.substring(i + 1)
        permutations(remaining, prefix + str[i])
    }
}

fun main() {
    permutations("STR")
}