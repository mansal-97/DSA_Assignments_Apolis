//"Compress a string using character counts
//Input: aabcccccaaa
// Output: a2b1c5a3"

fun compressString(str: String): String {

    val result = StringBuilder()
    var count = 1

    for (i in 1 until str.length) {
        if (str[i] == str[i - 1]) {
            count++
        } else {
            result.append(str[i - 1])
            result.append(count)
            count = 1
        }
    }

    result.append(str[str.length - 1])
    result.append(count)

    return result.toString()
}

fun main() {
    val input = "aabcccccaaa"
    println(compressString(input))
}