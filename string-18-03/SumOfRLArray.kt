//To find the index in an array where the sum of elements to the left equals the sum of
// elements to the right

fun indexWhereSumOfLeftEqualsRight(arr: Array<Int>): Int {
    var sum = 0
    for (num in arr) {
        sum += num
    }
    var leftSum = 0

    for (i in arr.indices) {
        val rightSum =sum - leftSum - arr[i]

        if (leftSum == rightSum) {
            return i
        }

        leftSum += arr[i]
    }
    return -1
}
fun main(){
    val arr= arrayOf(3,4,5,9,1,8,3)
    val i=indexWhereSumOfLeftEqualsRight(arr)
    if(i!=-1){
        println("Index where sum of left equals sum of right is $i")
    }else println("No index found")
}