fun main (){
    val samsungPhone = MobilePhone()
    println("Device name is: ${samsungPhone.name}")
    samsungPhone.turnOn()
    samsungPhone.turnOff()

}
class MobilePhone{
    val name = "Samsung A52"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn(){
        println("Mobile Phone is turned on.")
    }
    fun turnOff(){
        println("Mobile Phone is turned off.")
}

}

