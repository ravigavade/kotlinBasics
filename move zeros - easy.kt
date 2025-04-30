
fun main(){

    val nums = intArrayOf(0,1,0,3,12)

    for (i in 0 until nums.lastIndex){
        var j = i+1

        while (j != 0) j++

        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    for (i in 0 until nums.size) println(nums[i])


}