//"Find the longest substring without repeating characters
//Input: abcabcbb
// Output: abc (Length: 3)"

fun longestSubstring(s: String): String {
    val set = HashSet<Char>()
    var left = 0
    var maxLen = 0
    var start = 0

    for (right in s.indices) {

        while (set.contains(s[right])) {
            set.remove(s[left])
            left++
        }

        set.add(s[right])

        if (right - left + 1 > maxLen) {
            maxLen = right - left + 1
            start = left
        }
    }

    return s.substring(start, start + maxLen)
}

fun main() {
    val input = "abcabcbb"
    val result = longestSubstring(input)

    println("$result (Length: ${result.length})")
}