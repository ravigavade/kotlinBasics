

class Node(val data:Int, var next:Node?=null)

fun main(){

    var head = Node(10)
    val second = Node(20)
    val third = Node(30)

    head.next = second
    second.next = third

    var current :Node? = head

    while (current != null) {
        println(current.data)
        current= current.next
    }

}