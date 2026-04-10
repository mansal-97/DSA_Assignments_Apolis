//"Rabin-Karp algorithm for substring search
//Input: Text: abcdef, Pattern: cde
//Output: Pattern found at index 2"

fun rabinKarp(text: String, pattern: String) {
    val n = text.length
    val m = pattern.length

    val base = 256
    val mod = 101

    var pHash = 0
    var tHash = 0
    var power = 1
    var found = false

    for (i in 0 until m - 1) {
        power = (power * base) % mod
    }

    for (i in 0 until m) {
        pHash = (pHash * base + pattern[i].code) % mod
        tHash = (tHash * base + text[i].code) % mod
    }

    for (i in 0..n - m) {
        if (pHash == tHash && text.substring(i, i + m) == pattern) {
            println("Pattern found at index $i")
            found = true
        }

        if (i < n - m) {
            tHash = (tHash - text[i].code * power) % mod
            tHash = (tHash * base + text[i + m].code) % mod
            if (tHash < 0) tHash += mod
        }
    }

    if (!found) {
        println("Pattern not found")
    }
}

fun main() {
    val text = "abcdef"
    val pattern = "cde"
    rabinKarp(text, pattern)
}