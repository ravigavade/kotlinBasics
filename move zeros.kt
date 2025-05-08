

fun main(){

    val nums = intArrayOf(0,1,0,3,12)

    var j =0
    while (j < nums.size -1 && nums[j] != 0) j++

    for (i in j+1 until nums.size){
        if (nums[i] != 0){
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            j++
        }
    }

    for(w in nums) println(w)

}