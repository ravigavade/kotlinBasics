


fun main(){


    val nums = intArrayOf(2,2,1,1,1,2,2)

    val map = mutableMapOf<Int,Int>()

    for (i in 0 until nums.size){
        map[nums[i]] = map.getOrDefault(nums[i],0) +1
    }

    val threshold = nums.size/2

    for ((key,value) in map){
        if (value>threshold) println(key)
    }




}