

fun main(){

    val nums1 = intArrayOf(4,9,5)
    val nums2 = intArrayOf(9,4,9,8,4)

    val set = nums1.toSet()
    val ans = mutableSetOf<Int>()

    for (i in 0 until nums2.size){
        if (set.contains(nums2[i])){
            ans.add(nums2[i])
        }
    }




}