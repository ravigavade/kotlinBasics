

fun main(){

    val nums = intArrayOf(2,7,11,15)
    val target=9

    val ans= IntArray(2)

    for (i in nums.indices-1){
        for (j in nums.indices){
            if (nums[i] + nums[j] == target){
                ans[0]=i
                ans[1]=j
                break

            }
        }
    }

    println(ans)


}