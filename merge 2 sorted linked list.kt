

//class Node(val `val`:Int , var next: Node? = null)

fun main(){

    1-3-6-10
    val first = Node(1)
    val second = Node(3)
    val third = Node(6)
    val fourth = Node(10)

    first.next = second
    second.next = third
    third.next = fourth

    4-7-9
    val one = Node(4)
    val two = Node(7)
    val three = Node(9)

    one.next = two
    two.next = three

    //provided
    var list1 = first
    var list2 = one

    //for traversing the list
    var l1 = list1
    var l2 = list2

    //creating the dummy node
    var dummy = Node(0)
    var current = dummy

    while (l1 != null && l2 != null){

        if (l1.data <= l2.data){
            current.next = l1
            l1 = l1.next!!
        }else{
            current.next = l2
            l2 = l2.next!!
        }
        current = current.next!!
    }

    if (l1.next != null){
        current.next = l1
    }else{
        current.next = l2
    }







}