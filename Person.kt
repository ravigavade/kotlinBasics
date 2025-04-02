class Person(val name:String, var age:Int) {

    fun introduce(){
        println("Hi my name is $name and my age is $age")
    }

    fun haveBirthday(){
        age+=1
        println("Its my bday today! now im $age")
    }
}