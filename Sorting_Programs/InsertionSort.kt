fun insertionSort(arr:Array<Int>){
    for(i in 1 until arr.size){
        val key=arr[i]
        var j=i-1
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j]
            j--
        }
        arr[j+1]=key
    }
}
fun main(){
    val arr3= arrayOf(12,11,13,5,6)
    println("Before Insertion Sort: ${arr3.joinToString()}")
    insertionSort(arr3)
    println("After Insertion Sort: ${arr3.joinToString()}")
}