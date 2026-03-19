//Program to find longest common subsequence from list of strings.

fun longestCommonSubsequence(str1: String, str2: String): String {
    val m = str1.length
    val n = str2.length
    val lcsTable = Array(m + 1) { IntArray(n + 1) }

    for (i in 1..m) {
        for (j in 1..n) {
            if (str1[i - 1] == str2[j - 1]) {
                lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1
            } else {
                lcsTable[i][j] = maxOf(lcsTable[i - 1][j], lcsTable[i][j - 1])
            }
        }
    }

    var i = m
    var j = n
    val lcsResult = StringBuilder()
    while (i > 0 && j > 0) {
        if (str1[i - 1] == str2[j - 1]) {
            lcsResult.append(str1[i - 1])
            i--
            j--
        } else if (lcsTable[i - 1][j] > lcsTable[i][j - 1]) {
            i--
        } else {
            j--
        }
    }

    return lcsResult.reverse().toString()
}

fun longestCommonSubsequenceOfList(strings: List<String>): String {
    if (strings.isEmpty()) {
        return ""
    }

    var commonLCS = strings[0]
    for (i in 1 until strings.size) {
        commonLCS = longestCommonSubsequence(commonLCS, strings[i])
        if (commonLCS.isEmpty()) {
            break
        }
    }
    return commonLCS
}

fun main() {
    val strings = listOf("apple", "apricot", "pineapple")
    val lcs = longestCommonSubsequenceOfList(strings)
    println("Longest Common Subsequence: $lcs")
}