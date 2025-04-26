

fun main(){

    val nums = intArrayOf(4,1,2,1,2)

    nums.sort()

    var i = 0

    while (i < nums.lastIndex){
        if (nums[i] != nums[i+1]) println(nums[i])
        i+=2
    }




}