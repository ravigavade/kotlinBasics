


//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

fun main(){

    val first = ListNode(3)
    val second = ListNode(2)
    val third = ListNode(0)
    val fourth = ListNode(-4)

    first.next = second
    second.next = third
    third.next = fourth
//    fourth.next = second

    val head: ListNode = first
    var current:ListNode? = head
    var nxt:ListNode? = head

    while (current != null && nxt != null ){

        nxt = nxt.next?.next
        if (current == nxt ) {
            println("loop found")
            break
        }
        current = current.next

    }




}