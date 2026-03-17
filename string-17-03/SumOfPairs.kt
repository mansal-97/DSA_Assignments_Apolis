// Find all the pairs of array elements having sum equal to given number.

fun SumOfPairs(arr: Array<Int>, target: Int): Map<Int, Int> {
    val map = HashMap<Int, Int>()
    val result = HashMap<Int, Int>()
    for (num in arr) {
        var diff = target - num
        if (map.containsKey(diff)) {
            result[diff] = num

        }
        map[num] = 1

    }
    return result
}
fun main(){

    val arr = arrayOf(5, 3, 8,1, 4, 2,10)
    val result= SumOfPairs(arr, 11)

    println("Pairs with target 11 are : ")

    for ((k, v) in result) {
        println("($k,$v)")
    }
}