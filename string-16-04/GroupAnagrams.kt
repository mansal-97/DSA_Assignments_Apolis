//"Group anagrams from a list of strings
//Input: [""eat"", ""tea"", ""tan"", ""ate"", ""nat"", ""bat""]
// Output: [[""eat"", ""tea"", ""ate""], [""tan"", ""nat""], [""bat""]]"

fun groupAnagramsFromStrings(strs: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()

    for (word in strs) {
        val key = word.toCharArray().sorted().joinToString("")

        val list = map[key] ?: mutableListOf()
        list.add(word)
        map[key] = list
    }

    return map.values.toList()
}

fun main() {
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = groupAnagramsFromStrings(input)
    println(result)
}