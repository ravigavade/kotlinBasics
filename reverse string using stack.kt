import kotlin.math.sign


class stack(){

    private val list = mutableListOf<Char>()


    fun push(x:Char){
        list.add(x)
    }

    fun pop(): Char? {
        if (list.isNotEmpty()){
            return list.removeAt(list.size-1)
        }
        return null
    }

    fun peek(): Char? {
        return list.lastOrNull()
    }

    fun size():Int{
        return list.size
    }

}

fun main(){

    val stack = stack()

    val name = "Ravi"

    for (i in 0 until name.length) stack.push(name[i])

    var revString = ""
    while (stack.size() != 0){
        revString = revString.plus(stack.peek())
        stack.pop()
    }

    println(revString)


}



















