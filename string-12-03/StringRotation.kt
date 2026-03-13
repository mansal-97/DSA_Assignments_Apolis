//Check if strings are rotations of each other or not

fun stringRotations(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val concat = str1 + str1
    for (i in 0..concat.length - str2.length) {
        if (concat.substring(i, i + str2.length) == str2) {
            return true
        }
    }
    return false
}

fun main() {
    val result=stringRotations("camera", "acamer")
    println("Given Strings are rotations:$result")

}