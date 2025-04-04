//3. Create a Movie class
//Properties: title, rating
//
//Method: watch() → if rating >= 8, print "[title] is a great movie!"
//Otherwise, "[title] was okay."

fun main(){

    val Movie1=Movie("shivaji the boss", 5)
    Movie1.Watch()

}


class Movie(
    val title:String,
    val rating:Int
){
    fun Watch(){
        if(rating >= 8){
            println("$title is a great movie!")
        }else{
            println("$title was okay")
        }
    }
}