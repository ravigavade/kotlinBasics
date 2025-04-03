
fun main(){
    val words = listOf("apple", "banana", "grape", "watermelon", "kiwi")

// Output: 2 (banana and watermelon)

    for (i in words.indices){
        if(words[i].length>5) println(words[i])
    }
}