

fun main(){

    val nums = listOf(2,3,4,5,6)

    val fruits= mutableListOf("apples", "mango", "banana", "grapes")
    fruits.add("kiwi")
//    println(fruits)

//    for ( i in 0 until fruits.size){
//        println("wanna eat ${fruits[i]}? ")
//    }

    for (i in fruits.size-1 downTo 0){
        println(fruits[i])
    }



}