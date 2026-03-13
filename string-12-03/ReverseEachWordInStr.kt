//Reverse each word in a given string. E.g. input: Android is best output: diordnA si tseb
fun reverseEachWord(str: String): String {
    val sb = StringBuffer()
    var s = 0

    for (i in 0 until str.length) {
        if (str[i] == ' ') {
            sb.append(str.substring(s, i).reversed()).append(' ')
            s = i + 1
        }
    }

    sb.append(str.substring(s).reversed())

    return sb.toString()
}
fun main() {
    val result = reverseEachWord("Android is best")
    println(result)
}