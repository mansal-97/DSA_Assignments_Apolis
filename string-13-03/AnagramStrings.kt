//Check whether two strings are anagram of each other.

fun areAnagrams(str1: String, str2: String): Boolean {
    val map = HashMap<Char, Int>()

    for (ch in str1) {
        map[ch] = map.get(ch)?.plus(1) ?: 1
    }
    for (ch in str2) {
        if (map.containsKey(ch)) {
            map[ch] = map[ch]?.minus(1) ?: -1
            if (map[ch] == 0) {
                map.remove(ch)
            }
        } else {
            return false
        }
    }
    return map.isEmpty()
}

fun main() {
    val a = "LISTen".lowercase()
    val b = "SilENT".lowercase()

    if (areAnagrams(a, b)) {
        println("$a and $b are anagrams.")
    } else {
        println("$a and $b are not anagrams.")
    }
}
