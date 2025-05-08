

fun main(){

    val nums = intArrayOf(-6,-2,0,1,5,8)

    var i = 0
    var j = nums.lastIndex

    val ans = IntArray(nums.size)
    var p = ans.lastIndex

    while (i<=j){

        val s1 = nums[i]*nums[i]
        val s2 = nums[j]*nums[j]

        if (s1 < s2){
            ans[p] = s2
            p--
            j--
        }else{
            ans[p] = s1
            p--
            i++
        }
        if (i == j) ans[p] = s1

    }

    for (n in ans) println(n)

}