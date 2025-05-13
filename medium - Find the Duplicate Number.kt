

fun main(){

    val nums = intArrayOf(3,1,3,4,2)
    val map = mutableMapOf<Int,Int>()

    for (i in 0 until nums.size){
        map[nums[i]] = map.getOrDefault(nums[i],0) +1
    }

    for ((key,value) in map){
        if (value !=1) println(key)
    }




}