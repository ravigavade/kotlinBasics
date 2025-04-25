

fun main(){

    val nums = intArrayOf(1,2,3,4,5,6,7)
    var k =3

    while(k != 0){

        val temp = nums[nums.lastIndex]

        for (i in nums.lastIndex downTo 1){
            nums[i] = nums[i-1]
        }
        nums[0]=temp


        k--
    }

    for (i in 0 until nums.size) println(nums[i])



}