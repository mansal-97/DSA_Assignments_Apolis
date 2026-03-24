//Rearrange positive and negative numbers in an array
// such that positive and negative elements are alternate.

fun rearrangeElementsAlternative(arr: Array<Int>) {
    var i = 0
    var j = 1
    val n = arr.size

    while (i < n && j < n) {
        if (arr[i] >= 0) {
            i += 2
        } else if (arr[j] < 0) {
            j += 2
        } else {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp

            i += 2
            j += 2
        }
    }
}

fun main() {
    val arr = arrayOf(1, -2, 3, -4, -1, 4)

    rearrangeElementsAlternative(arr)

    println("Rearranged array:")
    println(arr.joinToString(" "))
}