//Remove characters from the first string which are present in the second string

fun removeCharsInFirstString(str1:String,str2:String):String{
    val str=StringBuffer()
    val map=HashMap<Char,Int>()
    for(ch in str2){
        map[ch]=(map[ch]?:0)+1
    }
    for(ch in str1){
        if(map[ch]==null){
            str.append(ch)
        }
    }
    return str.toString()
}
fun main(){
    val result=removeCharsInFirstString("atlantis","atlas")
    println("After removing characters :$result")
}