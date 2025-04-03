

fun main(){

    val numbers = listOf(1, 4, 7, 10, 13, 16)

// Output should be: 4, 10, 16

    for( i in numbers.indices){
        if (numbers[i]%2==0) println(numbers[i])
    }


}