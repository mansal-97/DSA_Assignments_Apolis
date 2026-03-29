
//Find the minimum distance between two given elements in an array.

fun minDistance(arr: Array<Int>, x: Int, y: Int): Int {
    var prevIndex = -1
    var minDist = -1

    for (i in arr.indices) {
        if (arr[i] == x || arr[i] == y) {
            if (prevIndex != -1 && arr[i] != arr[prevIndex]) {
                val dist = i - prevIndex
                if (minDist == -1 || dist < minDist) {
                    minDist = dist
                }
            }
            prevIndex = i
        }
    }
    return minDist
}
fun main(){
    val arr= arrayOf(4,8,2,9,5,7,1)
    println("Minimum distance between two elements:")
    println(minDistance(arr,8,5))
}