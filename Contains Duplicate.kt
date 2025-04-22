

fun main(){

    val nums = intArrayOf(1,2,3,1)

    for (i in 0 until nums.lastIndex){
        for (j in i+1 until nums.size){
            if (nums[i] == nums[j])
                println("duplicate found")
        }
    }


}