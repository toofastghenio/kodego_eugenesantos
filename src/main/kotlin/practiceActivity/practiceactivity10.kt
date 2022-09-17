fun main(){

    var phone = SmartPhone(20.0,50 )
}

class SmartPhone(var load: Double,var batteryPercentage : Int){


    init{
        println("Object Created!")
        println("Initial value of load is $load and battery Percentage is $batteryPercentage%")
    }

    //set parameter for functions
    //buyLoad(amount) // does not accept 0 or negative values
    //chargeBattery(percent) // does not accept 0 or negative values
    //sendText(message) // display message sent, load will decrement
    //checkBalance() // display current load, if zero, display "Check Operator Services"
    //call(minutes) //8php per minute, will not push through if no sufficient load
    fun buyLoad(amount: Double){
        //do action
    }

}