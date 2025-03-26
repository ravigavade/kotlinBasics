
fun main(){

    val input = readln().toIntOrNull()


//    if(input != null){
//         val output = when{
//            input == 0 -> "the input is 0"
//            input < 10 -> "the input is less than 10"
//            else -> "greatter than 10"
//        }
//    println(output)
//    }

    //we can also pass the variable directly to the when

//    if(input != null){
        val output=when(input){
            null-> "enter a valid number, baby<3 "
            0 -> "the number is zero"
            in 1..10 -> "the number in between 1 and 10"
            else -> "the number is greater than 10"
        }
    println(output)

//    }


}