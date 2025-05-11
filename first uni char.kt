


fun main(){

    val s = "loveleetcode"

    val map = mutableMapOf<Char,Int>()

    for (i in 0 until s.length){
        map[s[i]] = map.getOrDefault(s[i],0) +1
    }

    for ( i in 0 until s.length){
        if (map[s[i]] == 1){
            println(i)
            break
        }
    }



}