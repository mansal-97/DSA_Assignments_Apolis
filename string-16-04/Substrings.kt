//"Find all substrings of a given string
//Input: abc
// Output: a ab abc b bc c "

fun printAllSubstrings(str: String) {

    for (i in str.indices) {
        for (j in i until str.length) {
            println(str.substring(i, j + 1))
        }
    }
}

fun main() {
    val input = "abc"
    printAllSubstrings(input)
}