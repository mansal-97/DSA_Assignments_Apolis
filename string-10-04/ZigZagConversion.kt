//"Zigzag conversion of string
//Input: String: PAYPALISHIRING, Rows: 3
//Output: PAHNAPLSIIGYIR"

fun zigagConversion(text: String, rows: Int): String {

    val rowList = Array(rows) { StringBuilder() }

    var currentRow = 0
    var direction = 1

    for (ch in text) {
        rowList[currentRow].append(ch)

        if (currentRow == 0) {
            direction = 1
        }
        else if (currentRow == rows - 1) {
            direction = -1
        }

        currentRow += direction
    }

    val result = StringBuilder()
    for (row in rowList) {
        result.append(row)
    }

    return result.toString()
}

fun main() {
    val text = "PAYPALISHIRING"
    val rows = 3
    println("Output:${zigagConversion(text, rows)}")
}