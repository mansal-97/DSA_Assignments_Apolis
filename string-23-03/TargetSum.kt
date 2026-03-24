//Find all pairs in an array that sum up to a specific target value.

fun targetSum(arr: Array<Int>, target: Int): Map<Int, Int> {
    val map = HashMap<Int, Int>()
    val result = HashMap<Int, Int>()
    for (num in arr) {
        val diff = target - num
        if (map.containsKey(diff)) {
            result[diff] = num

        }
        map[num] = 1

    }
    return result
}
fun main(){

    val arr = arrayOf(5, 3, 8,1, 4, 2,10)
    val result= targetSum(arr, 7)

    println("Pairs with target 7 are : ")

    for ((k, v) in result) {
        println("($k,$v)")
    }
}