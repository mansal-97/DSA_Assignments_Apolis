//Find the maximum element in an array.

fun max(arr:Array<Int>){
    var max=arr[0]
    for(i in 1..arr.size-1){
        if(arr[i]>max){
            max=arr[i]
        }
    }
    println("Maximum Element in given Array is $max")
}
fun main(){
    val arr= arrayOf(13,9,45,21,78,300,12)
    max(arr)
}