//Remove duplicates from an array.

fun removeDuplicates(arr: Array<Int>): List<Int> {
    val result = ArrayList<Int>()
    for (i in arr.indices) {
        var isDuplicate = false
        for (j in result.indices) {
            if (arr[i] == result[j]) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate) {
            result.add(arr[i])
        }
    }
    return result
}

fun main() {
    val arr = arrayOf(5,6,3,4,8,5,1,3)
    val result = removeDuplicates(arr)

    for (num in result) {
        print("$num ")
    }
}