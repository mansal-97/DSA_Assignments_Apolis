//"Find the smallest rotation of a string that is lexicographically smallest
//Input: bca
//Output: abc"

fun smallestRotation(s: String): String {
    var result = s

    for (i in s.indices) {
        val rotation = s.substring(i) + s.substring(0, i)
        if (rotation < result) {
            result = rotation
        }
    }

    return result
}

fun main() {
    val input = "bca"
    val result = smallestRotation(input)
    println("Output: $result")
}