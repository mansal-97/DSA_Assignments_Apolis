//"Check if the input string has balanced parentheses
//Input: {[(())]}
// Output: Yes, the string has balanced parentheses."

fun isBalanced(str: String): Boolean {
    val stack = mutableListOf<Char>()

    for (ch in str) {
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.add(ch)
        } else if (ch == ')' || ch == '}' || ch == ']') {
            if (stack.isEmpty()){
                return false
            }

            val top = stack.removeAt(stack.size - 1)

            if ((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '[')
            ) {
                return false
            }
        }
    }
    return stack.isEmpty()
}

fun main() {
    val input = "{[(())]}"

    if (isBalanced(input)) {
        println("Yes, the string has balanced parentheses.")
    } else {
        println("No, the string does not have balanced parentheses.")
    }
}