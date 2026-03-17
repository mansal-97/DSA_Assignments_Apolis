//Find the second smallest number from the array.

fun secondMin(arr:Array<Int>){
    var min=arr[0]
    var secondMin=arr[1]
    if(min > secondMin){
        min = arr[1]
        secondMin = arr[0]
    }
    for (i in 2 .. arr.size-1) {
        if (arr[i] < min) {
            secondMin = min
            min = arr[i]
        } else if (arr[i] < secondMin && arr[i] != min) {
            secondMin = arr[i]
        }
    }
    println("The second smallest element is $secondMin")
}
fun main(){
    val arr= arrayOf(38,4,23,10,60,3,12)
    secondMin(arr)
}