

fun main(){

    val nums= intArrayOf(4,3,2,7,8,2,3,1)
    val mylist= mutableListOf<Int>()
    val map = mutableMapOf<Int,Int>()

    for (i in 0 until nums.size){
        map[nums[i]] = map.getOrDefault(nums[i],0) + 1
    }

    for ((key,value) in map){
        if (value ==2 ) println(key)
    }


}