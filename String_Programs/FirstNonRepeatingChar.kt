//Find first non-repeating character in the string.

fun firstNonRepeatingChar(str:String){
    val map= mutableMapOf<Char,Int>()
    for(ch in str){
            map[ch]=(map[ch]?:0)+1
    }
    for((k,v) in map){
        if(v==1){
            println("First Non-Repeating Char is $k")
            return
        }
    }
}
fun main(){
    firstNonRepeatingChar("camelcase")
}