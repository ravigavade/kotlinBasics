/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {

        var head1 : ListNode? = head
        var n :ListNode? = head

        // while (head1 != null){
        //     count++
        //     head1 = head1.next
        // }

        // head1 = head

        while (n?.next != null){
            head1 = head1?.next
            n = n.next?.next
        }


        return head1
    }
}