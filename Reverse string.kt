import kotlin.math.sin


fun main(){

    val s = charArrayOf('s','u','m','m','e','r')

    var j = s.lastIndex
    var i = 0

    while (i<j){
        val temp = s[i]
        s[i] = s[j]
        s[j] = temp
        i++
        j--
    }
//    s.reverse()

}