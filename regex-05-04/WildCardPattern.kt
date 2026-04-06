//"Wildcard pattern matching with ? and *
//Input:String: baaabab, Pattern: ba*a?
// Output: True"

fun isMatch(s: String, p: String): Boolean {
    var i = 0
    var j = 0
    var starIndex = -1
    var match = 0

    while (i < s.length) {
        if (j < p.length && (p[j] == '?' || p[j] == s[i])) {
            i++
            j++
        } else if (j < p.length && p[j] == '*') {
            starIndex = j
            match = i
            j++
        } else if (starIndex != -1) {
            j = starIndex + 1
            match++
            i = match
        } else {
            return false
        }
    }

    while (j < p.length && p[j] == '*') j++

    return j == p.length
}

fun main() {
    val str = "baaabab"
    val pattern = "ba*a?"
    println("Output:${isMatch(str, pattern)}")
}