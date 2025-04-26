

fun main(){

    val nums = intArrayOf(555,901,482,1771)
    var ans = 0

    for( i in 0 until nums.size){
        val number = nums[i].toString()
        var count = number.length
        if (count % 2 == 0 ) ans++

    }

    println(ans)

}