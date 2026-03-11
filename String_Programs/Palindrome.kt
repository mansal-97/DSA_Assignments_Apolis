//Check if a Given String is Palindrome or not without finding the reverse of the string.

fun palindrome(str:String){
    val l=str.length
    for(i in 0 until l/2){
        if(str[i]!=str[l-i-1]){
            println("$str is not Palindrome")
            return
        }
    }
    println("$str is Palindrome")
}
fun main(){
    palindrome("madam")
    palindrome("manasa")
}
