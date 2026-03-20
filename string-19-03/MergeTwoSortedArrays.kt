//Merge two sorted arrays into one sorted array.

fun mergeSortedArray(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    val size=arr1.size+arr2.size
    val result = Array(size) { 0 }

    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            result[k] = arr1[i]
            i++
        } else {
            result[k] = arr2[j]
            j++
        }
        k++
    }

    while (i < arr1.size) {
        result[k] = arr1[i]
        i++
        k++
    }

    while (j < arr2.size) {
        result[k] = arr2[j]
        j++
        k++
    }

    return result
}

fun main() {
    val arr1 = arrayOf(3,5,8,9,11,13)
    val arr2 = arrayOf(1,2,6,10,12,16,19)
    println("Merged Array:")
    val merged = mergeSortedArray(arr1, arr2)

    for (num in merged) {
        print("$num ")
    }
}