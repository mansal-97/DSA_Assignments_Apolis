//Sort an array using any sorting algorithm (e.g., bubble sort, insertion sort, quicksort).

fun bubbleSortArr(arr:Array<Int>){
    val size=arr.size
    for(i in 0 until size-1){
        for(j in 0 until size-i-1){
            if(arr[j]>arr[j+1]){
                val temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
            }
        }
    }
}

fun main(){
    val arr2= arrayOf(5,1,4,2,8)
    println("Before Bubble Sort: ${arr2.joinToString()}")
    bubbleSortArr(arr2)
    println("After Bubble Sort: ${arr2.joinToString()}")
}