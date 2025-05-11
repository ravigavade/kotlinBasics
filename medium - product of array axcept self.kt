

fun main(){

    val nums = intArrayOf(1,2,3,4)

    val ans = IntArray(nums.size)
    ans[0] = 1
    var prefix = 1
    for (i in 1 until nums.size){
        prefix = prefix * nums[i - 1]
        ans[i] = prefix
    }

    var postfix=1
    for ( i in nums.lastIndex-1 downTo 0){
        postfix = postfix*nums[i+1]
        ans[i] = ans[i] * postfix
    }

    for (i in ans) println(i)

}