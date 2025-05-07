

fun main(){
//    nums1 = [4,1,2], nums2 = [1,3,4,2]

    val nums1 = intArrayOf(4,1,2)
    val nums2 = intArrayOf(1,3,4,2)
    val nxt = IntArray(nums2.size)
    val result = IntArray(nums2.size)


    val stack = ArrayDeque<Int>()

    for (i in nums2.lastIndex downTo 0){

        while (stack.isNotEmpty() && stack.last() <= nums2[i] ){
            stack.removeLast()
        }

        if (stack.isNotEmpty() && stack.last() > nums2[i]){
            nxt[i] = stack.last()
        } else{
            nxt[i] = -1

        }

        stack.add(nums2[i])
    }

    for (n in nxt) println(n)



}



