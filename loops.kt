
fun main(){

    println("enter the no of elements you want: ")
    val numbers= readln().toIntOrNull() ?:0
    var sum=0
    var i=0
    val list= mutableListOf<Int>()


    println("enter the elements here:")
    while(i<numbers){
        val number= readln().toIntOrNull() ?: 0
        list.add(number)
        sum += number
        i++
    }

    println("the elements rn in the list are:")

//    for (q in 0 until numbers){
//        print(list[q])
//    }



    //better way to print:
    //say for: every single number(in list) we want its own print statement
    for (item in list){
        println(item)
    }

//    println("the total sum is $sum")
//
//    println("the entered numbers are: $list")

    println("____________________________")
    val num= listOf<Int>(1,2,3,4,5)

    for (t in num.lastIndex downTo 0){
        println(num[t])
    }



}