

fun main(){

    val digits : IntArray= intArrayOf(9)

    var number = 0

    for (i in 0 until digits.size){
        number = number * 10 + digits[i]
    }

    number += 1

    val length = number.toString().length
    var num1 = number

    val ans = IntArray(length)

    for (i in ans.lastIndex downTo 0){
        val digit = num1 % 10
        ans[i] = digit
        num1 /= 10
    }

    println(ans.joinToString())


}