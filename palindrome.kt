

fun main(){

    val ans=palindrome(90)
    println(ans)

}

fun palindrome(num:Int): Boolean{

    var number = num
    var rev = 0

    while (number!=0){
        val digit = number % 10
        rev = rev * 10 + digit
        number /= 10
    }

    if (num == number) return true

    return false

}

