//Find the maximum circular subarray sum.

fun maxCircularSum(arr: Array<Int>): Int {
    var totalSum = arr[0]
    var currMax = arr[0]
    var maxSoFar = arr[0]
    var currMin = arr[0]
    var minSoFar = arr[0]

    for (i in 1 until arr.size) {
        val x = arr[i]
        totalSum += x

        currMax += x
        if (x > currMax) {
            currMax = x
        }
        if (currMax > maxSoFar) {
            maxSoFar = currMax
        }

        currMin += x
        if (x < currMin) {
            currMin = x
        }
        if (currMin < minSoFar) {
            minSoFar = currMin
        }
    }

    if (maxSoFar < 0) {
        return maxSoFar
    }

    val remainingTotal = totalSum - minSoFar

    if (maxSoFar > remainingTotal) {
        return maxSoFar
    } else {
        return remainingTotal
    }
}

fun main() {
    val arr = arrayOf(4, 5, 2, 8, 9, 3)
    println("Max Circular Sum: ${maxCircularSum(arr)}")
}