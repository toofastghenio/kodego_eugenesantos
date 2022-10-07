package Exercises
//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F
fun main() {
    var amount: Double = 0.00
    var condition: Boolean = true

    try {
        print("Input the desire amount: ")
        amount = readln().toDouble()

        while (condition) {
            print("Do you wish to input another desire amount? ")
            var answer: String = readln().lowercase()

            if (answer == "yes") {
                print("Enter new desire amount: ")
                var newamount: Double = readln().toDouble()
                amount = amount + newamount

                println("The Total Desire Amount is $amount")
                println()

            } else if (answer != "no") {
                println("Please answer with yes or no only")
                println()

            } else if (answer == "no") {
                print("The Total Desire Amount is $amount")
                println()

                println("Do you wish to Divide the Total Amount by how many? ")
                var divisor: Int = readln().toInt()

                var totalDesireAmount: Double = amount / divisor
                println("Total :  $totalDesireAmount")


                println()
                println("Spend Wisely on your Withdrawal")
                break
            }

        }
    } catch (e: Exception) {
        println("Please enter a valid amount!")

    }
}