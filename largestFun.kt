
// maxOfList(listOf(3, 9, 2)) → 9

fun main(){

    val numlist= listOf(3,9,2)

    val result=maxOfList(numlist)
    println(result)

}

fun maxOfList(list: List<Int>):Int{

    var ans=list[0]
    for (i in 0 until list.size){
        if (list[i]>ans) ans=list[i]
    }

    return ans

}