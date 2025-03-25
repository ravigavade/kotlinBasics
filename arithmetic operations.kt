
fun main(){

    val x=5
    val y=10

//    x++ n stuff works haha

//    x=x+5 can also be written as x+=5

    println("The 2 numbers are $x and $y")
    println("")

//  sum of 2 numbers
    val addition=x+y
    println("Addition is $addition")

//    subtraction of 2 numbers
    val sub=x-y
    println("Subtraction is $sub")

//    multiplication
    val multi=x*y
    println("multiplication is $multi")

//    modules
    val mod=x%y
    println("modules is $mod")

    println(x==y) //checks if they are same, comparison op
    println(x>=y)
    println(x<=y)

    val areNumbersTheSame= x==y
    println(areNumbersTheSame)

    println("cheching if even")
    println("is x an even number?, $x , the remainder is ${x%2}. therefore ${x%2==0} ")

}