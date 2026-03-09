fun MergeSort(arr: Array<Int>):Array<Int>{
    if(arr.size<=1) {
        return arr
    }
    var mid = arr.size/2
    var left = MergeSort(arr.sliceArray(0 until mid))
    var right = MergeSort(arr.sliceArray(mid until arr.size))
    return merge(left,right)
}
fun merge(left: Array<Int>, right: Array<Int>):Array<Int> {
    val res= mutableListOf<Int>()
    var i =0
    var j =0
    while (i < left.size && j < right.size) {
        if (left[i] < right[j]) {
            res.add(left[i])
            i++
        } else {
            res.add(right[j])
            j++
        }
    }
    res.addAll(left.sliceArray(i until left.size).toList())
    res.addAll(right.sliceArray(j until right.size).toList())

    return res.toTypedArray()
}
fun main(){
    val arr4= arrayOf(38,27,43,3,9)
    println("Before Merge Sort: ${arr4.joinToString()}")
    val sortedArr4 = MergeSort(arr4)
    println("After Merge Sort: ${sortedArr4.joinToString()}")
}