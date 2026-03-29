//Find the median of two sorted arrays of different sizes.

fun medianOfSortedArrays(arr1: Array<Int>, arr2: Array<Int>): Double {
    val m = arr1.size
    val n = arr2.size
    val total = m + n
    val mergedArr = IntArray(total)

    var i = 0
    var j = 0
    var k = 0

    while (i < m && j < n) {
        if (arr1[i] < arr2[j]) {
            mergedArr[k] = arr1[i]
            i++
        } else {
            mergedArr[k] = arr2[j]
            j++
        }
        k++
    }

    while (i < m) {
        mergedArr[k] = arr1[i]
        i++
        k++
    }

    while (j < n) {
        mergedArr[k] = arr2[j]
        j++
        k++
    }

    val mid = total / 2
    if (total % 2 == 0) {
        return  (mergedArr[mid] + mergedArr[mid - 1]).toDouble() / 2.0
    } else {
        return  mergedArr[mid].toDouble()
    }
}

fun main() {
    val a1 = arrayOf(2, 3, 5, 7)
    val b1 = arrayOf(1, 8, 9)
    println("Median of two sorted arrays: ${medianOfSortedArrays(a1, b1)}")
}