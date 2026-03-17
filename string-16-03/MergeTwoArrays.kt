//Merge two arrays to form a third array e.g. First array: 10, 50, 20, 30, 70, 80, 40
//Second array: 25, 75, 5, 25 Merged array should be: 10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40

fun mergeArrays(arr1: Array<Int>, arr2: Array<Int>): ArrayList<Int> {
    val result = ArrayList<Int>()
    var i = 0
    var j = 0
    while (i < arr1.size && j < arr2.size) {
        result.add(arr1[i])
        result.add(arr2[j])
        i++
        j++
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
    val arr1 = arrayOf(10, 50, 20, 30, 70, 80, 40)
    val arr2 = arrayOf(25, 75, 5, 25)

    val result = mergeArrays(arr1, arr2)
    println(result)
}