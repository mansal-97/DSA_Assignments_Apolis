//"Check if a string can be rearranged to form a palindrome
//Input: civic
// Output: Yes, it can be rearranged to form a palindrome."

fun canFormPalindrome(str: String): Boolean {
    val map = HashMap<Char, Int>()

    for (ch in str) {
        map[ch] = (map[ch] ?: 0) + 1
    }

    var oddCount = 0

    for (value in map.values) {
        if (value % 2 != 0) {
            oddCount++
        }
    }

    return oddCount <= 1
}

fun main() {
    val input = "civic"

    if (canFormPalindrome(input)) {
        println("Yes, it can be rearranged to form a palindrome.")
    } else {
        println("No, it cannot form a palindrome.")
    }
}