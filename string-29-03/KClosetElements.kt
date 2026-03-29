//Find the k closest elements to a given value in an array.
import kotlin.math.abs

fun kClosestElements(arr: Array<Int>, k: Int, x: Int): Array<Int> {
    var left = 0
    var right = arr.size - 1

    while (right - left + 1 > k) {
        if (abs(arr[left] - x) > abs(arr[right] - x)) {
            left++
        } else {
            right--
        }
    }

    val result = Array(k) { 0 }
    var index = 0
    for (i in left..right) {
        result[index++] = arr[i]
    }

    return result
}

fun main() {
    val arr = arrayOf(5,7,8,9,11,14,21)
    val k = 2
    val x = 8
    val closest = kClosestElements(arr, k, x)
    println("Closet Elements to given $x are:")
    println(closest.joinToString(","))
}