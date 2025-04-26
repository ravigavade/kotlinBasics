

fun main(){

    val nums = intArrayOf(1,2,1)
    val ans = IntArray(nums.size * 2)

    var j = ans.size / 2


    for (i in 0 until nums.size){
        ans[i] = nums[i]
        ans[j] = nums[i]
        j++
    }

    for (num in ans){
        println(num)
    }

}