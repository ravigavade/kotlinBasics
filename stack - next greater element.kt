

fun main(){

    val nums = intArrayOf(6,8,0,1,3)
    val stack = ArrayDeque<Int>()
    val result = IntArray(nums.size)

    for (i in nums.lastIndex downTo 0){

        while (stack.isNotEmpty() && stack.last() < nums[i]){
            stack.removeLast()
        }

        if (stack.isNotEmpty() && stack.last() > nums[i]){
            result[i] = stack.last()
        }

        stack.addLast(nums[i])
    }

    for (n in result) print(n)




}