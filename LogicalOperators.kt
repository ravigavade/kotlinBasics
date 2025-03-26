
fun main(){

    val x=89
    val y=8

//    val areBothEven= x%2==0 && y%2==0
//    val areBothEven= x%2==0 || y%2==0
//    println("$areBothEven")

//    to take an input from user
    println("enter a number:")
    val input= readln().toInt()


    println("The input number is $input")

    val isEven = input % 2 == 0
    println("Is the number even? $isEven")

}