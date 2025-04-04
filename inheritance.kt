

fun main(){

    val name = Dog("Toffee")
    name.eat()

}


open class Animal(
    val name:String
){
    fun eat(){
        println("$name is eating")
    }
}

class Dog(name: String):Animal(name) {
    fun bark() {
        println("$name says woof!")
    }
}