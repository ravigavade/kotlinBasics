

// class Node( val data: Int, var next: Node? = null)

fun main(){
    var sum = 0

    val first = Node(10)
    val second = Node(10)
    val third = Node(10)

    first.next = second
    second.next = third

    var current : Node?  = first
    while (current != null){
        sum += current.data
        current = current.next
    }

    println(sum)


}