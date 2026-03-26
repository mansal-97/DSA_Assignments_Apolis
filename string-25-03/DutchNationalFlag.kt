//Sort an array of 0s, 1s, and 2s (Dutch National Flag problem).

fun dutchNationalFlag(arr: Array<Int>) {
    var low = 0
    var mid = 0
    var high = arr.size - 1

    while (mid <= high) {
        if (arr[mid] == 0) {
            val temp = arr[low]
            arr[low] = arr[mid]
            arr[mid] = temp
            low++
            mid++
        } else if (arr[mid] == 1) {
            mid++
        } else {
            val temp = arr[mid]
            arr[mid] = arr[high]
            arr[high] = temp
            high--
        }
    }
}

fun main() {
    val arr = arrayOf(2, 0, 1, 2, 1, 0, 1, 2)
    dutchNationalFlag(arr)
    println(arr.joinToString(" "))
}