//Print all the duplicate chars in the input string.

fun duplicateChar(str:String){
    val map=HashMap<Char,Int>()
    for(ch in str){
        map[ch]=(map[ch]?:0)+1
    }
    println("Duplicate Chars in given $str are:")
    for((k,v) in map){
        if(v>1){
            print("$k ")
        }
    }
}
fun main(){
    duplicateChar("happiesthour")
}