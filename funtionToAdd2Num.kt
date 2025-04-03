

fun main(){

    println("enter first number: ")
    val number1= readln().toInt()
    println("enter second number: ")
    val number2= readln().toInt()

    val ans=add(number1,number2)
    println("addition of $number1 + $number2 is $ans ")

}

fun add(num1:Int,num2:Int):Int{
    // Call it like: add(3, 5) → should return 8

    return num1+num2

}