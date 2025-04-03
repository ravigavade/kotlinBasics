

// greet("Kotlin") → Hi, Kotlin!
// greet()         → Hi, friend!


fun main(){
    greeting("kotlin")

}

fun greeting(name:String="friend"){
    println(" Hi, $name")
}