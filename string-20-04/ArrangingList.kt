//"Kotlin program for Given a list of non-negative integers nums,
//arrange them such that they form the largest number and return it.
//Input: nums = [10,2]
//Output: ""210""
//Input: nums = [3,30,34,5,9]
//Output: ""9534330"""

fun largestNumber(nums: Array<Int>): String {

    for (i in 0 until nums.size - 1) {
        for (j in i + 1 until nums.size) {
            val a = nums[i].toString()
            val b = nums[j].toString()

            if (a + b < b + a) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
    }

    if (nums[0] == 0) {
        return "0"
    }

    var result = ""
    for (num in nums) {
        result += num.toString()
    }

    return result
}

fun main() {
    val arr1 = arrayOf(10, 2)
    println(largestNumber(arr1))

    val arr2 = arrayOf(3, 30, 34, 5, 9)
    println(largestNumber(arr2))
}