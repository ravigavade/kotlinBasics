

fun main(){

    val physics=Book("whats gravity?","Isac newton")

    physics.write()

}

class Book(
    var name:String,
    var author:String
){
    init {
        val book=name
        val writer=author

        println("the $book was written by $writer")
    }
    fun write(){
        println("the book was $name and was written by $author")
    }


}