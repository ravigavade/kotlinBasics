
//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

fun main(){

    val first = ListNode(2)
    val second = ListNode(4)
    val third = ListNode(3)

    val one = ListNode(5)
    val two = ListNode(6)
    val three = ListNode(4)

    first.next = second
    second.next = third

    one.next = two
    two.next = three

    val l1 : ListNode? = first
    val l2 : ListNode? = one

    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    var h1: ListNode? = l1
    var h2: ListNode? = l2

    while (h1 != null){
        list1.add(h1.`val`)
        h1 = h1.next
    }
    while (h2 != null){
        list2.add(h2.`val`)
        h2 = h2.next
    }


    list1.reverse()
    list2.reverse()

    var number1 = 0
    for (i in 0 until list1.size){
        number1 = number1 *10 + list1[i]
    }

    var number2 = 0
    for (i in 0 until list2.size){
        number2 = number2 *10 + list2[i]
    }

    var numberSum = number2+number1 // 807


    var head : ListNode? = null
    var current: ListNode? = null

    // Handle 0 explicitly (for cases like adding 0 + 0)
    if (numberSum == 0) {
        head = ListNode(0)
    } else {
        while (numberSum != 0) {
            val digit = numberSum % 10
            val newNode = ListNode(digit)

            if (head == null) {
                head = newNode
                current = head
            } else {
                current?.next = newNode
                current = current?.next
            }

            numberSum /= 10
        }
    }


    while (head!= null){
        println(head.`val`)
        head = head.next
    }




}