//Find the leaders in an array
// (an element is a leader if it is greater than all the elements to its right).

fun findLeaders(nums: Array<Int>) {

    val leaders = mutableListOf<Int>()
    var current = nums[nums.size - 1]
    leaders.add(current)

    for (i in nums.size - 2 downTo 0) {
        if (nums[i] > current) {
            current = nums[i]
            leaders.add(current)
        }
    }

    leaders.reverse()
    println("Leaders in the array:")
    for (leader in leaders) {
        println(leader)
    }
}

fun main() {
    val arr = arrayOf(16, 17, 4, 3, 5, 2)
    findLeaders(arr)
}