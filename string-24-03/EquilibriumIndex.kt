//Find the equilibrium index of an array
//(an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices).

fun findEquilibriumIndex(arr: IntArray): Int {
    val sum = arr.sum()
    var leftSum = 0

    for (i in arr.indices) {
        val rightSum = sum - leftSum - arr[i]

        if (leftSum == rightSum) {
            return i
        }

        leftSum += arr[i]
    }

    return -1
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 2, 2)

    val index = findEquilibriumIndex(arr)

    if (index != -1) {
        println("Equilibrium index: $index")
    } else {
        println("No equilibrium index found")
    }
}