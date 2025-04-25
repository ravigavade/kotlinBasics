
fun main(){

    val nums = intArrayOf(3,2,1)

    val set = nums.toSet()
    val ans = set.toIntArray()
    ans.sort()
    if (ans.size > 3) println(ans[ans.size - 3])
    else println(ans[0])

//    var index:Int
    //


}