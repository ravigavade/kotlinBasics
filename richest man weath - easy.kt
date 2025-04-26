import kotlin.math.max

fun main(){

    val array2D = arrayOf(
        intArrayOf(1, 5),
        intArrayOf(7, 3),
        intArrayOf(3, 5)
    )

    var sum = 0
    var maxSum = 0

    for (i in 0 until array2D.size){

        maxSum=max(maxSum,sum)
        sum = 0

        for (j in 0 until array2D[i].size){
            sum = sum + array2D[i][j]

        }
    }

    println(maxSum)

}