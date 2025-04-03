

// reverseWord("zero") → "orez"


fun main(){
    println("enter a word: ")
    val input= readln()
    val result=reverseWord(input)
    println(result)

}

fun reverseWord(word:String):String{

    var rev =""
        for (i in word.lastIndex downTo 0){
            rev+=word[i]
        }


    return rev

}