


fun main(){

    val first = ListNode(4)
    val second = ListNode(1)
    val eighth = ListNode(8)
    val fourth = ListNode(4)
    val figth = ListNode(5)

    val five = ListNode(5)
    val six = ListNode(6)
    val one = ListNode(1)

    first.next = second
    second.next = eighth
    eighth.next = fourth
    fourth.next = figth

    five.next = six
    six.next = one
    one.next = eighth

    var headA : ListNode? = first
    var headB : ListNode? = five

    var size1 =0
    var size2 = 0

    var head1:ListNode? =headA
    var head2:ListNode? =headB

    while (head1 != null){
        size1++
        head1 = head1.next
    }

    while (head2 != null){
        size2++
        head2 = head2.next
    }

    // ptr1 will always be pointing to the longest LL
    var ptr1 : ListNode? = null
    var ptr2 : ListNode? = null

    var difference:Int
    if (size1 > size2) {
        difference = size1 - size2
        ptr1 = headA
        ptr2 = headB
    }
    else {
        difference = size2 - size1
        ptr1 = headB
        ptr2 = headA
    }

    while (difference != 0){
        ptr1 = ptr1?.next
        difference--
//        println(ptr1?.`val`)
    }

    while (ptr2 !=null && ptr1 != null){
        if (ptr2 == ptr1) println(ptr2.`val`)
        ptr2 = ptr2.next
        ptr1 = ptr1.next
    }





}