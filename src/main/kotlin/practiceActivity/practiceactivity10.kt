//Create a class called SmartPhone
//
//attributes(use proper data types):
//load
//batteryPercentage
//(you can add your ow attributes)
//
//functions:
//buyLoad(amount) // does not accept 0 or negative values
//chargeBattery(percent) //does not accept 0 or negative values, should not exceed 100%
//sendText(message) //display message sent, load will decrement
//checkBalance() // display current load, if zero, display "Check operator services"
//call(minutes) //8 load per minute,  will not push through if no sufficient load
package practice_activities


fun main(){

    var smartphone = SmartPhone()
    var smartfeatures = arrayListOf("Credit Wallet", "Battery Percentage", "Load Info","Phone number")
    var smartfunctions = arrayListOf("Buy Credits", "Status of Battery", "Credit Checker", "Call")

    println("Select Phone Features:")
    println("*****************************")
    println(smartfeatures)
    println()

    println("Select Phone Functions:")
    println("*****************************")
    println(smartfunctions)
    println()

    print("Choose Category:")
    var chosencategory = readln()
    if (chosencategory == smartfeatures[0]){
        smartphone.BalanceCredit()
    }

    else if (chosencategory == smartfeatures[1]){
        println("Your Battery is ${smartphone.spPercentageOfBattery}%")
    }
    else if (chosencategory == smartfeatures[2]){
        println("Your Remaining Load is ${smartphone.creditamount}")
    }
    else if (chosencategory == smartfeatures[3]){
        println("Please enter your Phone Number ${smartphone.dialNumber}")
    }

    else if (chosencategory == smartfunctions[0]){
        smartphone.BalanceCredit()
    }

    else if (chosencategory == smartfunctions[1]){
        smartphone.ChargeBattery()
    }

    else if (chosencategory == smartfunctions[2]){
        smartphone.BalanceCredit()
    }

    else if (chosencategory == smartfunctions[3]){
        smartphone.Call()
    }
}
//create a class called SmartPhone
class SmartPhone {

    var creditbalance = 0
    var spPercentageOfBattery: Int = 100
    var creditamount: Double = readln().toDouble()
    var dialNumber: Double = readln().toDouble()

    init {
        println("Smart Phone System")

    }
    fun BalanceCredit() {//does not accept 0 or negative values
        print("Enter an amount you want to load:")
        var creditamount: Double = readln().toDouble()
        if (creditamount <= 0) {
            println("Invalid amount")
            ReturnCredit()
        }
        val totalcredit = creditbalance + creditamount
        println("Your Balance is now: $totalcredit")
    }
    fun ChargeBattery() {//does not accept 0, negative values or should not exceed 100%
        var spPercentageOfBattery: Int = 100
        if (spPercentageOfBattery <= 20 && (spPercentageOfBattery >= 1)){
            println("You are Running Low Battery")
        }
        else if (spPercentageOfBattery <= 0) {
            println("invalid input: $spPercentageOfBattery")
        }
        else if (spPercentageOfBattery > 100) {
            println("INVALID input: $spPercentageOfBattery")
        }
        else{
            println("Your Battery is $spPercentageOfBattery%")
        }
    }
    fun ReturnCredit() {//display current load, if zero, display "Check Operator Services"
        if (creditbalance == 0){
            println("Check Operator Services")
        }
        else {
            println("Your Remaining Balance is $creditbalance Pesos")
        }
    }
    fun Call() {//8 load per minute, will not push through if no sufficient load
        print("Dial the phone number:")
        var dialNumber: Double
        readln().toDouble()

        if (creditbalance <= 7 && (creditbalance >= 0)) {
            println("Insufficient Load")
            println("Call Disconnected")
            println("Your Remaining Balance: $creditbalance Pesos")
        }
        else if (creditbalance < 0) {
            println("invalid")
        }
        else if (creditbalance >= 8) {
            println("Call Connected")
            print("Call Minutes:")
            var callminutes: Int = readln().toInt()
            var remainingcredit = callminutes * 8
            var creditbalance = creditbalance - remainingcredit
            println("Your Remaining Balance is $creditbalance Pesos")
        }
    }
}