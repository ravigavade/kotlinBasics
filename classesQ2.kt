
//2. Create a Student class
//Properties: name, grade
//init block should print "[name] is enrolled in grade [grade]"
//Add method study() → print "[name] is studying hard."


fun main(){

    val Student1=Student("Ravi", "M.S 2nd Year")
    Student1.study()

}

class Student(
    val name:String,
    val grade: String,
){
    init {
        println("$name is enrolled in grade $grade")
    }
    fun study(){
        println("$name is studying hard")
    }
}
