fun quickSort(arr: Array<Int>, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSort(arr, low, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, high)
    }
}
fun partition(arr: Array<Int>, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        } }
    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1
}

fun main() {
    val arr6= arrayOf(10,7,8,9,1,5)
    println("Before Quick Sort: ${arr6.joinToString()}")
    quickSort(arr6,0,arr6.size-1)
    println("After Quick Sort: ${arr6.joinToString()}")
}