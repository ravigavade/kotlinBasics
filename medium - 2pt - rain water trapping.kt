import kotlin.math.min


fun main(){

    val nums = intArrayOf(1,8,6,2,5,4,8,3,7)

    var max = 0
    var i =0
    var j = nums.lastIndex

    while (i<j){

        val l = j-i
        val b = min(nums[i],nums[j])
        val ans = l*b

        max = maxOf(max,ans)

        if (nums[i] < nums[j]) i++
        else j--
    }

    println(max)

}