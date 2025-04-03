
//1. Create a Car class
//Properties: brand, year
//Method: drive() → print "Driving a [brand] from [year]"
//Create a Car object and call drive()

fun main(){

    val omni=Car("Supra",2025)
    omni.drive()

}

class Car(
    var brand:String,
    var year:Int
){
    fun drive(){
        println("Driving a $brand from year $year")
    }
}