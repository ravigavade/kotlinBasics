

fun main(){

    val colors = listOf("Red", "Green", "Blue", "Yellow")

// Output:
// Yellow
// Blue
// Green
// Red

    for (i in colors.size-1 downTo 0){
        println(colors[i])
    }
}