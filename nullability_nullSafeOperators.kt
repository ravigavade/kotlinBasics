
fun main(){

//    take a look at this topic again lol


    println("enter a number: ")

    val input = readln().toIntOrNull() ?:0 //this means that
//    val input1= readln().toIntOrNull()?.equals(0)
    //if there is null in input, ?: means that 0 will be the default value

    val isEven= input%2==0
    println("the number is $isEven")
}