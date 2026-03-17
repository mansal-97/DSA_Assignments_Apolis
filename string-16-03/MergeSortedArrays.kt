//Merge two sorted array to form third sorted array: e.g. First Array: 10, 28, 50, 75, 80, 95, 100
// Second array: 35, 60, 70, 78
// Expected Merged sorted array: 10, 28, 35, 50, 60, 70, 75, 78, 80, 95, 100

fun mergeSortedArrays(arr1: Array<Int>, arr2: Array<Int>): ArrayList<Int> {
    val result = ArrayList<Int>()
    var i = 0
    var j = 0
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            result.add(arr1[i])
            i++
        } else {
            result.add(arr2[j])
            j++
        }
    }
    while (i < arr1.size) {
        result.add(arr1[i])
        i++
    }
    while (j < arr2.size) {
        result.add(arr2[j])
        j++
    }

    return result
}

fun main() {
    val arr1 = arrayOf(10, 28, 50, 75, 80, 95, 100)
    val arr2 = arrayOf(35, 60, 70, 78)

    val merged = mergeSortedArrays(arr1, arr2)
    println(merged)
}