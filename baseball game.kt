


fun main(){

    val operations: Array<String> = arrayOf("5","-2","4","C","D","9","+","+")


        val stack = ArrayDeque<Int>()

    for (i in 0 until operations.size){
        if ( operations[i] != "C" && operations[i] != "D" && operations[i] != "+"){
            stack.addLast(operations[i].toInt())
        }else if ( operations[i] == "C"){
            stack.removeLast()
        }else if ( operations[i] == "D"){
            val number = 2 * stack.last()
            stack.addLast(number)
        }else if ( operations[i] == "+"){
            val t = stack.removeLast()
            val n = t + stack.last()
            stack.addLast(t)
            stack.addLast(n)
        }
    }


    println(stack)

    var sum = 0
    while (stack.isNotEmpty()){
        val n = stack.removeLast()
        sum += n
    }
    println(sum)


}