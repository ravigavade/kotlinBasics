

fun main(){

//    val nums = intArrayOf(0,1,2,2,3,0,4,2)
    val nums = intArrayOf(1)
    val `val`=1
    var index=0


    for (j in nums.lastIndex downTo 0){
        println(" value of j : $j")
        if (nums[j] == `val` ) continue

        for (i in 0 .. j){
            println("value of i: $i")
            if (nums[i] == `val`){
                var temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp

                break
            }
        }
    }

    for (i in 0 until  nums.lastIndex){
        if (nums [i+1] == `val`) {
            index = i
            break
        }
    }

    println(index)



}