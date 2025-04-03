

fun main(){
    val numbers = listOf(3, 6, 2, 9, 5)

// Output: 9

    var greatest=numbers[0]

    for(num in numbers){
        if (num>greatest) greatest=num
    }

    println(greatest)
}