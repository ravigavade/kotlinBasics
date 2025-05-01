

//class Node(val data:Int, var next:Node?=null)


fun main(){

    val value = 40

    val first = Node(20)
    val second = Node(20)
    val third = Node(40)

    first.next = second
    second.next = third

    var current: Node? = first
    while (current != null){
        if (current.data == value) println("present")
        current = current.next
    }


}