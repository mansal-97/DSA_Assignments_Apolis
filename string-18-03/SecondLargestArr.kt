//Find the second largest element in an array.

fun secondMax(arr:Array<Int>){
    var max = arr[0]
    var secondMax = arr[1]

    if(max < secondMax){
        max = arr[1]
        secondMax = arr[0]
    }
    for (i in 2 .. arr.size-1) {
        if (arr[i] > max) {
            secondMax = max
            max = arr[i]
        } else if (arr[i] > secondMax && arr[i] != max) {
            secondMax = arr[i]
        }
    }
    println("The second largest element is $secondMax")
}
fun main(){
    val arr= arrayOf(38,4,23,10,60,3,12)
    secondMax(arr)
}