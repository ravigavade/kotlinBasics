
fun main(){

    println("please enter a number:")
    val input= readln().toIntOrNull()

//    if(input!=null){
//        print("the number is even -> ")
//        println(input%2==0)
//    }else println("invalid entry")

    //we can use if statements as an expression
    if (input!=null){  //we need to check for nullability

        val output= if(input%2==0){ //or else we get an error here. we cannot null%2 lol
            input+1
        }else{
            input-1
        }
    println(output)
    }

}