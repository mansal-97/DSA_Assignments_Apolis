fun recursiveBinarySearch(arr:Array<Int>,low:Int,high:Int,target:Int):Int{
    if(low>high){
        return -1
    }
    val mid=low+(high-low)/2
    if(arr[mid]==target){
        return mid
    }
    else if(target>arr[mid]){
        return recursiveBinarySearch(arr,mid+1,high,target)
    }
    else{
        return recursiveBinarySearch(arr,low,mid-1,target)
    }
}
fun main(){
    val arr= arrayOf(2,4,6,8,10)
    print("index${recursiveBinarySearch(arr,0,arr.size-1,6)}")
}