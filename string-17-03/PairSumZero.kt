//Find the first pair of array elements having sum equal to zero.

fun findPairOfSumZero(input: Array<Int>): Array<Int>? {
    val map = LinkedHashMap<Int, Int>()

    for (i in input) {
        val diff = -i

        if (map.containsKey(diff)) {
            return arrayOf(diff, i)
        } else {
            map[i] = i
        }
    }
    return null
}

fun main() {
    val arr = arrayOf(0, 4, 3, 6,-4, 0)

    println("Pair with Sum Zero:")
    val result = findPairOfSumZero(arr)

    if (result != null) {
        println("${result[0]}, ${result[1]}")
    } else {
        println("No pair found")
    }
}