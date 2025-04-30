

fun main(){

    val nums1 = intArrayOf(3,3,4,5,6,6,9,9,9)
    val nums2 = intArrayOf(3,4,4,5,5,6,9,9)
    val ans = mutableListOf<Int>()

    nums2.sort()
    nums1.sort()
    var j = 0
    var pointer = 0

    for(i in 0 until nums1.size){

        for (j in pointer until nums2.size){
            if (nums1[i] == nums2[j]){
                ans.add(nums2[j])
                pointer = j+1
                break
            }
        }
    }

    println(ans)





}