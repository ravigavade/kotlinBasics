

fun main(){

    println("enter a string:")
    val name:String= readln()

    val rev=reverse(stringToReverse = name)//just making is more readable(name-parameters)
    println(rev)

//    if(rev==name){
//        println("thats a palindrome")
//    }

}

fun reverse(stringToReverse:String="hello?" ):String{
    val reversedName= buildString{
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
        }
    }
    return reversedName
}

