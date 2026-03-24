//Find the missing number in an array containing numbers from 1 to n.

fun findMissingNumbers(nums: Array<Int>, n: Int) {
    for (i in 1..n) {
        if (!nums.contains(i)) {
            println(i)
        }
    }
}

fun main() {
    val arr = arrayOf(1,2,7,4,5,6)
    val n = 7
    println("Missing number:")
    findMissingNumbers(arr, n)
}