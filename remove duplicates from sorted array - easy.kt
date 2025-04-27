

fun main(){

    val nums = intArrayOf(1,1,2)

    var count = 0

    for (i in 0 until nums.lastIndex){
        if (nums[i] != nums[i+1]){
            nums[count] = nums[i]
            count++
        }
    }
    nums[count]=nums[nums.lastIndex]

    println(count)



}