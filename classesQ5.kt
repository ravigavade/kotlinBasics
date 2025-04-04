//5. Create a Pet class
//Properties: name, type (e.g., cat, dog)
//init block → print "A new [type] named [name] was adopted!"
//Method makeSound() → if dog, print "Woof!", if cat, print "Meow!", else "??"

fun main(){

    val pet1=Pet("toffie","dog")
    pet1.makeSound()

}

class Pet(
    val name:String,
    val type:String
){
    init {
        println("A new $type named $name was adopted!")
    }

    fun makeSound(){
        if (type=="dog") println("Woof!")
        else if (type=="cat") println("Meow!")
        else println("??")
    }

}