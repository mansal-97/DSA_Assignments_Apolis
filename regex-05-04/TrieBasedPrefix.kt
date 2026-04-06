//"Suffix array or Trie-based prefix search
//Input: Words: [""cat"", ""cater"", ""cart"", ""carbon""], Prefix: car
// Output: [""cart"", ""carbon""]"

class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var isWord = false
}

class Trie {
    private val root = TrieNode()

    fun insert(word: String) {
        var node = root
        for (ch in word) {
            if (!node.children.containsKey(ch)) {
                node.children[ch] = TrieNode()
            }
            node = node.children[ch]!!
        }
        node.isWord = true
    }

    fun searchPrefix(prefix: String): List<String> {
        var node = root
        for (ch in prefix) {
            if (!node.children.containsKey(ch)) {
                return emptyList()
            }
            node = node.children[ch]!!
        }

        val result = mutableListOf<String>()
        collectWords(node, prefix, result)
        return result
    }

    private fun collectWords(node: TrieNode, currentWord: String, result: MutableList<String>) {
        if (node.isWord) {
            result.add(currentWord)
        }

        for ((ch, childNode) in node.children) {
            collectWords(childNode, currentWord + ch, result)
        }
    }
}

fun main() {
    val words = listOf("cat", "cater", "cart", "carbon")
    val prefix = "car"

    val trie = Trie()

    for (word in words) {
        trie.insert(word)
    }

    val output = trie.searchPrefix(prefix)
    println( "Output:$output")
}