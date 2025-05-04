


fun main(){


    val s = "abbaca"

    val stack = ArrayDeque<Char>()

    for (i in 0 until s.length){

        if (stack.isEmpty() || s[i] != stack.last()) stack.addLast(s[i])
        else stack.removeLast()

    }

    var ans = StringBuilder()
    while (stack.isNotEmpty()){
        ans.append(stack.removeLast())
    }

    println(ans.reversed())
}