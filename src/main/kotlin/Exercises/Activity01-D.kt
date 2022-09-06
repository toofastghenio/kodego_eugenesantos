package exercises
//Create an application that will accept monetary amounts. The application will continue to accept values until a “No” is set as input for the question “Do you want to add another amount?”.
//After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//The total of the first input will be divided by the second input.
//Note: Error checking must be done.

fun main(){

    //Start of the program
    println("Please Enter Currency")
    var currency1 : Int = readln().toInt()


    //Will the client add any amount?
    if ((currency1 >=1) && (currency1 <= 1000000)){
        println("The Currency you entered is $currency1.")
    }
    println("Do you want to add another currency? Kindly choose YES or NO")
    var currency2: String = readln().toString()

    //The client will add amount
    if(currency2 == "YES") {
        println("Please enter additional currency.")
        var currency3 : Int = readln().toInt()
        var totalCurrency1 : Int = currency1 + currency3
        println("The total amount you enter is $totalCurrency1")
        println("Divide the value by how many?")
        var divisor1 : Int = readln().toInt()
        var grandCurrency1 : Int = totalCurrency1 / divisor1
        println("Your total currency is $grandCurrency1")

        //The client will NOT add amount
    }else if(currency2 == "NO"){
        println("Divide the currency by how many?")
        var divisor2 : Int = readln().toInt()
        var grandCurrency2 : Int = currency1 / divisor2
        println("Your total amount is $grandCurrency2")
    }

    println("Thank you so much for your withdrawal. We hope you will withdraw again.")

}