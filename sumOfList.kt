

fun main(){

    val nums = listOf(5, 10, 15, 20)

// Output: 50

    var sum1=0
    for(i in nums.indices){
        sum1+=nums[i]
    }
    println(sum1)

//    println(nums.sum())

}