


fun main(){

    val stack = MyStack()

    stack.push(10)
    stack.push(20)
    stack.push(30)

    println(stack.peek())      // 30
    println(stack.pop())       // 30
    println(stack.peek())      // 20
    println(stack.size())      // 2
    println(stack.isEmpty())   // false

}