//Find the majority element (element that appears more than n/2 times) in an array.

fun majorityElement(arr:Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    val n = arr.size

    for (num in arr) {
        map[num] = (map[num] ?: 0) + 1
        if (map[num]!! > n / 2){
            return num
        }
    }

    return -1
}
fun main(){
    val arr= arrayOf(3,7,7,7,4,2,7,7)
    val result=majorityElement(arr)
    if(result!=-1){
        println("Majority element is $result")
    }else println("No majority element found.")
}