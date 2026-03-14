//Program to remove the same consecutive char from the input string.
// E.g. input string: ssuuppperrrrr coooommpuuuuuuuuttttter output should be: super computer

fun removeConsecutiveChar(input: String): String {
    val result = StringBuilder()
    result.append(input[0])

    for (i in 1 until input.length) {
        if (input[i] != input[i - 1]) {
            result.append(input[i])
        }
    }

    return result.toString()
}

fun main() {
    val input = "ssuuppperrrrr coooommpuuuuuuuuttttter"
    val output = removeConsecutiveChar(input)
    println(output)
}