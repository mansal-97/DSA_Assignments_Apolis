//"Find the minimum window substring from s that contains all characters of t
//Input: s: ADOBECODEBANC, t: ABC
//Output: BANC"

fun minimumWindowString(s: String, t: String): String {
    val map = HashMap<Char, Int>()

    for (ch in t) {
        map[ch] = (map[ch] ?: 0) + 1
    }

    var left = 0
    var count = t.length
    var minLen = Int.MAX_VALUE
    var start = 0

    for (right in s.indices) {
        val ch = s[right]

        if ((map[ch] ?: 0) > 0) {
            count--
        }

        map[ch] = (map[ch] ?: 0) - 1

        while (count == 0) {
            if (right - left + 1 < minLen) {
                minLen = right - left + 1
                start = left
            }

            val leftChar = s[left]
            map[leftChar] = (map[leftChar] ?: 0) + 1

            if ((map[leftChar] ?: 0) > 0) {
                count++
            }

            left++
        }
    }
   if (minLen == Int.MAX_VALUE) {
       return ""
   } else {
       return s.substring(start, start + minLen)
   }
}

fun main() {
    val s = "ADOBECODEBANC"
    val t = "ABC"

    val result = minimumWindowString(s, t)
    println("Output:$result")
}