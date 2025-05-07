
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

fun main(){

    val s = arrayOf("h","e","l","l","o")
    var j = s.lastIndex
    var i =0
    while ( i < j){
        val temp = s[i]
        s[i] = s[j]
        s[j] = temp
    i++
        j--
    }

    for(i in s) println(i)

}