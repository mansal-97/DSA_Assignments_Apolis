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

fun MergeSort(arr: Array<Int>): Array<Int> {
    if (arr.size <= 1){
        return arr
    }
    val mid = arr.size / 2
    val left = MergeSort(arr.sliceArray(0 until mid))
    val right = MergeSort(arr.sliceArray(mid until arr.size))
    return merge(left, right)
}
fun merge(left: Array<Int>, right: Array<Int>): Array<Int> {
    val res = Array(left.size + right.size) { 0 }
    var i = 0
    var j = 0
    var k = 0
    while (i < left.size && j < right.size) {
        if (left[i] < right[j]) {
            res[k++] = left[i++]
        } else {
            res[k++] = right[j++]
        }
    }
    while (i < left.size) {
        res[k++] = left[i++]
    }
    while (j < right.size){
        res[k++] = right[j++]
    }
    return res
}

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

fun quickSort(arr: Array<Int>, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSort(arr, low, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, high)
    }
}
fun partition(arr: Array<Int>, low: Int, high: Int): Int {
    val pivot = arr[high]
    var i = low - 1
    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        } }
    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp
    return i + 1
}

fun main() {

    val arr1=arrayOf(29,10,14,37,13)
    println("Before Selection Sort: ${arr1.joinToString()}")
    selectionSort(arr1)
    println("After Selection Sort: ${arr1.joinToString()}")

    val arr2= arrayOf(5,1,4,2,8)
    println("Before Bubble Sort: ${arr2.joinToString()}")
    bubbleSortArr(arr2)
    println("After Bubble Sort: ${arr2.joinToString()}")

    val arr3= arrayOf(12,11,13,5,6)
    println("Before Insertion Sort: ${arr3.joinToString()}")
    insertionSort(arr3)
    println("After Insertion Sort: ${arr3.joinToString()}")

    val arr4= arrayOf(38,27,43,3,9)
    println("Before Merge Sort: ${arr4.joinToString()}")
    val sortedArr4 = MergeSort(arr4)
    println("After Merge Sort: ${sortedArr4.joinToString()}")

    val arr5= arrayOf(3,2,1)
    println("Before Improved Bubble Sort: ${arr5.joinToString()}")
    improvedBubbleSort(arr5)
    println("After Improved Bubble Sort: ${arr5.joinToString()}")

    val arr6= arrayOf(10,7,8,9,1,5)
    println("Before Quick Sort: ${arr6.joinToString()}")
    quickSort(arr6,0,arr6.size-1)
    println("After Quick Sort: ${arr6.joinToString()}")
}