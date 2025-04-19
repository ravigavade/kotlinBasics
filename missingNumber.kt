

fun main(){

//    Input: nums = [3,0,1]
//    Output: 2
//
//    Explanation:
//    n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//    2 is the missing number in the range since it does not appear in nums.

    val nums= intArrayOf(0,1)
    var ans=nums.size
    nums.sort()

    for (i in 0 until nums.size) {
        if(nums[i] != i) ans = i
        if(i == nums[i] && i == nums.size) ans = i+1
    }

    println(ans)


}

