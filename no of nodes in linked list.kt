

//class Node(val data:Int, var next:Node?=null)


fun main(){

    val first = Node(20)
    val second = Node(30)
    val third = Node(30)
    val forth = Node(90)

    first.next=second
    second.next = third
    third.next = forth

    var count = 0
    var current: Node? = first
    while (current != null){
        count ++
        current=current.next
    }

    println(count)

}
