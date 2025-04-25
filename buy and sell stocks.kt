fun main(){

    val nums = intArrayOf(7,1,5,3,6,4)

    var minSoFar = nums[0]
    var profit = 0

    for (i in 0 until nums.size){
        if(minSoFar > nums[i]) minSoFar = nums[i]

        if (nums[i] - minSoFar > profit) profit = nums[i] - minSoFar

    }

    println(profit)


















    //brute force

//    var profit =0
//    for (i in 0 until nums.lastIndex){
//        for (j in i+1 until nums.size){
//            if (nums[j] - nums[i] > profit) profit = nums[j] - nums[i]
//        }
//    }
//
//    println(profit)

}