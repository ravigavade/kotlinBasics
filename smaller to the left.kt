

fun main(){

    val nums = intArrayOf(4,5,2,10,8)
    val list = mutableListOf<Int>()
    val stack = ArrayDeque<Int>()

    for (i in 0 until nums.size){

        if (stack.isEmpty()){
            list.add(-1)
        }
        else if (stack.isNotEmpty() && stack.last() < nums[i]){
            list.add(stack.last())
        }else{
            while (stack.isNotEmpty() && nums[i] < stack.last()){
                stack.removeLast()
            }
            if (stack.isEmpty()) list.add(-1)
            else list.add(stack.last())
        }

        stack.add(nums[i])

    }

    println(list)

}