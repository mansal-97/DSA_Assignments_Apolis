//Find the smallest positive integer missing from an unsorted array.

fun smallestPositiveMissing(arr: Array<Int>): Int {
    val set = mutableSetOf<Int>()
    for (num in arr) {
        if (num > 0) {
            set.add(num)
        }
    }

    var i = 1
    while (true) {
        if (!set.contains(i)) {
            return i
        }
        i++
    }
}

fun main() {
    val array = arrayOf(2,3,-3,4,7,9)
    println("Smallest Posivitive Integer Missing is:")
    println(smallestPositiveMissing(array))
}