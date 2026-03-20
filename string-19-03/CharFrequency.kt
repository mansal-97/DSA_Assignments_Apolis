//Find the frequency of each element in an array.

fun frequencyOfElement(arr: Array<Int>) {
    val map = HashMap<Int, Int>()

    for (num in arr) {
        if (map.containsKey(num)) {
            map[num] = map[num]!! + 1
        } else {
            map[num] = 1
        }
    }
    println("Frequency of Each Element:")
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

fun main() {
    val arr = arrayOf(3,2,7,6,5,4,2,3)
    frequencyOfElement(arr)
}