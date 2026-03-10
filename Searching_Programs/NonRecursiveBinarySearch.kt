fun nonRecursiveBinarySearch(arr:Array<Int>,target:Int):Int{
    var low=0
    var high=arr.size-1
    while(low<=high){
        val mid = low+(high - low)/ 2
        if(target==arr[mid]){
            return mid
        }else if(target>arr[mid]){
            low=mid+1
        }else{
            high=mid-1
        }
    }
    return -1
}
fun main(){
    val arr= arrayOf(1,3,5,7,9)
    print("index${nonRecursiveBinarySearch(arr,7)}")
}