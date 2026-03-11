//Find the most recurring char in the input string.

fun mostRecurringChar(str: String): Char {
    val map = HashMap<Char, Int>()
    for (ch in str) {
        val count = map[ch]
        if (count != null) {
            map[ch] = count + 1
        } else {
            map[ch] = 1
        }
    }
    var maxKey = ' '
    var maxValue = 0
    for ((k, v) in map) {
        if (v > maxValue) {
            maxValue = v
            maxKey = k
        }
    }
    return maxKey
}

fun main() {
    val char = mostRecurringChar("happy")
    println("Most Recurring Char is $char")
}