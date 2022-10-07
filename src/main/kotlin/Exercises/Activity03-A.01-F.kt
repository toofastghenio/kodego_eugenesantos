package Exercises
//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F}
fun main(){
    try {
        println("Please input a Character:")
        var char: String = readln().uppercase()
        println("The character you input is:")
        println(char)

        // Reversed
        println()
        println("If the input character is reversed:")
        println(char.reversed().uppercase())

        // Reversed
        var length: Int = char.length
        println("The Input character length is $length")

        // Condition
        println()
        if (char == char.reversed().uppercase()) {
            println("The character you input is PALINDROME")
        } else if (char != char.reversed())
            println("The character you input is NOT a PALINDROME")
    } catch (e: Exception) {
        println("Please input a valid character!")

    }
    println("Thank You very Much for Using PALINDROME CHECKER")
}
