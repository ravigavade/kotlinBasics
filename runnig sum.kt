

fun main(){


    val nums = intArrayOf(1,1,1,1,1)

    var sum = 0
    val ans = mutableListOf<Int>()

    for (i in 0 until nums.size){
        sum +=nums[i]
        ans.add(sum)
    }
    println(ans)

}


