//Find the minimum element in an array.

fun min(arr:Array<Int>){
    var min=arr[0]
    for(i in 1..arr.size-1){
        if(arr[i]<min){
            min=arr[i]
        }
    }
    println("Minimum Element in given Array is $min")
}
fun main(){
    val arr= arrayOf(13,9,45,21,78,300,12)
    min(arr)
}