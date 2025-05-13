

fun main(){

    val nums = intArrayOf(3,1,6,2,4)

    val ans = mutableListOf<Int>()
    val stack=ArrayDeque<Int>()

    for (i in 0 until nums.size){

        if (stack.isEmpty()){
            ans.add(-1)
        } else if (stack.isNotEmpty() && stack.last() <= nums[i]){
            while (stack.isNotEmpty() && stack.last() <= nums[i] ){
                stack.removeLast()
            }
            if (stack.isEmpty()) ans.add(-1)
            else ans.add(stack.last())

        }else{
            ans.add(stack.last())
        }
        stack.add(nums[i])
    }


    println(ans)


}