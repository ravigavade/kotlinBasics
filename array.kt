
fun main()
{

    val array= intArrayOf(22,33,45,56)
    println("the size of the array is ${array.lastIndex} -> 0 based")
    val input = readln().toIntOrNull()

    if(input != null && input in 0..array.lastIndex){
        println("the element at index $input is ${array[input]}")
    }else{
        println("invalid choice")
    }
//    println(array[0])
}