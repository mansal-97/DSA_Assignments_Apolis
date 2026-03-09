fun improvedBubbleSort(arr:Array<Int>){
    val size=arr.size
    for(i in 0 until size-1){
        var isSwapped=false
        for(j in 0 until size-i-1){
            if(arr[j]>arr[j+1]){
                val temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
                isSwapped=true
            }
        }
        if(!isSwapped){
            break
        }
    }
}
fun main(){
    val arr5= arrayOf(3,2,1)
    println("Before Improved Bubble Sort: ${arr5.joinToString()}")
    improvedBubbleSort(arr5)
    println("After Improved Bubble Sort: ${arr5.joinToString()}")
}