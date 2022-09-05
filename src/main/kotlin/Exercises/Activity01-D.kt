package exercises

fun main(){
    //Start of the program
    println("Enter the Amount")
    var amount1 : Double = readln().toDouble()


    //Will the client add any amount?
    if ((amount1 >=1) && (amount1 <= 1000000000000)){
        println("You have entered the amount of $amount1.")
    }
    println("Do you need to add another amount? Please select either YES or NO")
    var amount2: String = readln().toString()

    //The client will add amount
    if(amount2 == "YES") {
        println("Please enter your requested additional amount.")
        var amount3 : Double = readln().toDouble()
        var totalAmount1 : Double = amount1 + amount3
        println("The total amount you enter is $totalAmount1")
        println("Divide the value by how many?")
        var divisor1 : Int = readln().toInt()
        var grandTotal1 : Double = totalAmount1 / divisor1
        println("Your total amount is $grandTotal1")

        //The client will NOT add amount
    }else if(amount2 == "NO"){
        println("Divide the value by how many?")
        var divisor2 : Int = readln().toInt()
        var grandTotal2 : Double = amount1 / divisor2
        println("Your total amount is $grandTotal2")
    }

    println("Thank you so much for your withdrawal. We hope to business with you always.")

}