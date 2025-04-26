

fun main(){

    val s = "A man, a plan, a canal: Panama"
    val q=s.replace(" ","").lowercase()

    var j = q.length-1

    for (i in 0 until j){
        if (q[i] != q[j]) {
            println(q[i])
            println("not")
        }
        j--
    }

}