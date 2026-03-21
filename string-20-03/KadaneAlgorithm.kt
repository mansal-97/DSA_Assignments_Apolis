// Find the contiguous subarray with the largest sum (Kadane's algorithm).

fun maxContiguousSubArray(arr: Array<Int>): Int {
    var sum = arr[0]
    var maxSum = arr[0]

    var start = 0
    var end = 0
    var tempStart = 0

    for (i in 1 until arr.size) {

        if (sum + arr[i] > arr[i]) {
            sum += arr[i]
        } else {
            sum = arr[i]
            tempStart = i
        }

        if (sum > maxSum) {
            maxSum = sum
            start = tempStart
            end = i
        }
    }
    print("Subarray: ")
    for (i in start..end) {
        print("${arr[i]} ")
    }
    println()

    return maxSum
}

fun main() {
    val arr = arrayOf(-2, 1, -3, 4, -1, 2, 1)

    val result = maxContiguousSubArray(arr)

    println("Max Sum: $result")
}