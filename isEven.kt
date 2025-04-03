
// isEven(4) → true
// isEven(5) → false

fun main(){
    println("please enter a number: ")
    val num= readln().toInt()

    val result = isEven(num)
    println("the number is Even -> $result")

}

fun isEven(number:Int):Boolean{
    if (number%2==0) return true
    else return false
}