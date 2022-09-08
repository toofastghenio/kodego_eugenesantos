package exercises
//Activity 01 - G
//Create an application that will accept 2 Integers. It will identify the lower value and bigger value of the two inputs. Then, your application will print all the prime numbers starting from the lower number up to the largest number.

//# Kotlin program to display all the prime numbers within an interval

fun main(args: Array<String>) {
    var low = 0
    val high = 100

    while (low < high) {
        var riders = false

        for (s in 2..low / 2) {
            // condition for nonprime number
            if (low % s == 0) {
                riders = true
                break
            }
        }

        if (!riders)
            print("$low ")

        ++low
    }
}