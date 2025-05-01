


// class Node(val data:Int, var next: Node? = null)

fun main(){

    val first = Node(10)
    val second = Node(30)
    val third = Node(140)

    first.next = second
    second.next = third

    var current:Node? = first
    while (current != null){
        if (current.next == null){
            println(current.data)
            break
        }
        current = current.next
    }



}