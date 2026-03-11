//Remove duplicate chars from the input string.

fun removeDuplicateCharsInString(str: String): StringBuffer {
    val result = StringBuffer()
    val map = HashMap<Char, Boolean>()
    for (ch in str) {
        if (map[ch] == null) {
            map[ch] = true
            result.append(ch)
        }
    }
    return result
}
fun main(){
    val str=removeDuplicateCharsInString("seamless")
    println("After removing duplicate chars:$str ")
}