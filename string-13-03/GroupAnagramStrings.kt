//"Program to group anagram strings.
//Input: [""act"", ""race"", ""listen"", ""silent"", ""hello"", ""cat"", ""tac"" ]
//Output:[  [ act, cat, tac ], [ listen, silent ] ]"

fun groupAnagrams(words: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()

    for (word in words) {
        val key = word.toCharArray().sorted().joinToString("")
        if (map.containsKey(key)) {
            map[key]?.add(word)
        } else {
            map[key] = mutableListOf(word)
        }
    }

    val result = mutableListOf<List<String>>()
    for (l in map.values) {
        if (l.size > 1) {
            result.add(l)
        }
    }

    return result
}

fun main() {
    val input = arrayOf("act", "race", "listen", "silent", "hello", "cat", "tac")
    val output = groupAnagrams(input)
    println(output)
}