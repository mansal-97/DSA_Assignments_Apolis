//Find the kth smallest/largest element in an array.

fun kthSmallestAndLargest(arr: Array<Int>, k: Int) {
    val n = arr.size
    if (k < 1 || k > n) {
        println("Invalid value")
        return
    }

    for (i in 0 until k) {
        var minIndex = i
        for (j in i + 1 until n) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
    println("$k-th smallest element is ${arr[k - 1]}")

    for (i in 0 until k) {
        var maxIndex = i
        for (j in i + 1 until n) {
            if (arr[j] > arr[maxIndex]){
                maxIndex = j
            }
        }
        val temp = arr[i]
        arr[i] = arr[maxIndex]
        arr[maxIndex] = temp
    }
    println("$k-th largest element is ${arr[k - 1]}")
}

fun main() {
    val arr = arrayOf(16,3,8,6,1,4,9,12,45)
    kthSmallestAndLargest(arr, 3)
}