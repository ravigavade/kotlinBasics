

fun main(){

    val p1=person("ravi",24)
    p1.hello()

    val dog=animal("toffie","cross")
    dog.bark()

}

class person(
    var name:String,
    var age:Int
){
    fun hello(){
        println("sup $name, youre $age")
    }

}

class animal(
    var name:String,
    var species:String
){
    fun bark(){
        println("$name say bhaw bhaw lol coz hes $species")
    }
}

