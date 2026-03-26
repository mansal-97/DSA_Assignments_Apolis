//Find the intersection of two arrays.

fun intersectionOfArraysUsingMap(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    val map = mutableMapOf<Int, Int>()
    val temp = mutableListOf<Int>()

    for (num in arr1) {
        map[num] = (map[num] ?: 0) + 1
    }

    for (num in arr2) {
        val count = map[num] ?: 0
        if (count > 0) {
            temp.add(num)
            map[num] = count - 1
        }
    }

    val result = Array(temp.size) { 0 }
    for (i in temp.indices) {
        result[i] = temp[i]
    }

    return result
}

fun main() {
    val array1 = arrayOf(3, 7, 5, 1, 9)
    val array2 = arrayOf(1, 2, 4, 5, 10, 13)

    val intersection = intersectionOfArraysUsingMap(array1, array2)
    println("Intersection of Given arrays:")
    println(intersection.joinToString(", "))
}