//Count the number of occurrences of each char in the input string.

fun occurancesOfChar(str:String):HashMap<Char,Int>{
    val map= HashMap<Char,Int>()
    for(ch in str){
        if(map.containsKey(ch)){
            map[ch]=map[ch]!!+1
        }
        else{
            map[ch]=1
        }
    }
    return map
}
fun main(){
    val map=occurancesOfChar("mapplesyrup")
    for((k,v) in map){
        println("$k -> $v")
    }
}