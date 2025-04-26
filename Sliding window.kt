import kotlin.math.max


fun main(){

    val nums = intArrayOf(2,3,1,2,4,3)
    val k = 3

    var i = 0
    var j = 0
    var sum = 0
    var maxSum = 0

    while (j < nums.size){

        sum += nums[j]
        if (j - i + 1  < k) j++
        else if ( j - i + 1 == k ){
            maxSum = max(maxSum , sum)
            sum -= nums[i]
        }
        i++
        j++
    }
    println(maxSum)

}