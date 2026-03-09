fun selectionSort(arr:Array<Int>){
    val size=arr.size
    for(i in 0 until size-1){
        var minIndex=i
        for(j in i+1 until size){
            if(arr[minIndex]>arr[j]){
                minIndex=j
            }
        }
        val temp=arr[minIndex]
        arr[minIndex]=arr[i]
        arr[i]=temp
    }
}
fun main(){
    val arr1=arrayOf(29,10,14,37,13)
    println("Before Selection Sort: ${arr1.joinToString()}")
    selectionSort(arr1)
    println("After Selection Sort: ${arr1.joinToString()}")
}