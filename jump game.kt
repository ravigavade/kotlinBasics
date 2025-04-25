
fun main(){

    val nums = intArrayOf(3,2,1,0,4)

    var maxJump = nums[0]

    for (i in 0 until nums.size){

        maxJump-- //first jump

        //check
        if (maxJump < nums[i]) maxJump = nums[i]

        if (maxJump == 0) println("false")

    }
    println(true)

}