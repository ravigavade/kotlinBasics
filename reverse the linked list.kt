

// class Node(val data:Int, var next:Node? = null)

fun main(){

    val first = Node(10)
    val second = Node(20)
    val third = Node(30)

    first.next = second
    second.next = third

    var prev: Node? = null
    var nxt : Node? = null
    var current : Node? = first
    while (current != null){
        nxt = current.next
        current.next = prev

        prev = current
        current = nxt
    }

    current=prev
    while (current != null){
        println(current.data)
        current=current.next
    }


}