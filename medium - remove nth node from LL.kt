

fun main() {
    val first = ListNode(1)
    val second = ListNode(2)
    val third = ListNode(3)

    val fourth = ListNode(4)
    val figth = ListNode(5)

    first.next = second
    second.next = third
    third.next = fourth
    fourth.next = figth

    val n = 2

    val head : ListNode? = first
    var size = 0

    val dummy = ListNode(0)
    dummy.next = head

    var h:ListNode? = dummy

    while(h != null){
        size++
        h = h.next
    }

//    if(size == n )  head?.next


    var count = size - n
//    println(count)  //3

    h=head
    while (count > 1){
//        println(h?.`val`)
        count --
        h=h?.next
    }
    if (h != null) {
        h.next = h.next?.next
    }

    h = head
    while (h != null){
        println(h.`val`)
        h=h.next
    }


}