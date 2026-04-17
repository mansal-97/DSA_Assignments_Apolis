//"Check if a string is a subsequence of another
//Input: String1: abc
//String2: a1b2c3
//Output: Yes, 'abc' is a subsequence of 'a1b2c3'"

fun subsequenceStrings(str1: String, str2: String): Boolean {
    var i = 0
    var j = 0

    while (i < str1.length && j < str2.length) {
        if (str1[i] == str2[j]) {
            i++
        }
        j++
    }
    if(i == str1.length){
        return true
    } else {
        return false
    }
}

fun main() {
    val str1 = "abc"
    val str2 = "a1b2c3"

    if (subsequenceStrings(str1, str2)) {
        println("Yes, '$str1' is a subsequence of '$str2'")
    } else {
        println("No, '$str1' is not a subsequence of '$str2'")
    }
}