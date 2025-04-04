//4. Create a BankAccount class
//Properties: accountHolder, balance
//
//Method deposit(amount: Int) → adds to balance and prints new balance
//
//Method withdraw(amount: Int) → subtracts and prints new balance
//
//Add a method showBalance() that just prints the current balance

fun main(){

    val Ravi=BankAccount("ravi",90000)
    Ravi.showBalance()
    Ravi.deposit(10000)

}

class BankAccount(
    val accountHolder:String,
    var balance:Int
){

    fun deposit(amount:Int){
        balance+=amount
        println("the new balance is $balance")
    }

    fun withdraw(amount: Int){
        balance-=amount
        println("the new balance is $balance")
    }

    fun showBalance(){
        println("current balance is $balance")
    }

}