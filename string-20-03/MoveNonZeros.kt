//Move all zeros to the end of an array while maintaining the order of non-zero elements.

fun moveZeros(arr:Array<Int>){
    var index=0
    for(num in arr){
        if(num!=0){
            arr[index]=num
            index++
        }
    }
    while(index<arr.size){
        arr[index]=0
        index++
    }
    println("After Moving Zeros to the end Updated Array is : ")
    for(num in arr){
        print("$num")
    }
}

fun main(){

    val arr= arrayOf(1,0,3,4,0,0,8,5,7)
    moveZeros(arr)

}