
//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

fun main(){

    val first = ListNode(1)
    val second = ListNode(1)
    val third = ListNode(2)
    val forurth = ListNode(3)
    val fifth = ListNode(3)
    val sixith = ListNode(3)
    val seventh = ListNode(4)

    first.next = second
    second.next = third
    third.next = forurth
    forurth.next = fifth
    fifth.next = sixith
    sixith.next = seventh

    var head:ListNode = first
    var node: ListNode? = first
    var current:ListNode? = head
    var q:ListNode = head

    while (current != null){
        if (current.`val`  != q.`val`){
            q.next = current
            q = current

        }
        current = current.next
    }

    while (node != null){
        println(node.`val`)
        node = node.next
    }



}