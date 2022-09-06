package practiceActivity
//Practice Activity 1
//Create a Kotlin program that will accept your first name, middle initial/name, and last name then display them together in a single on the screen
//Sample Output
//Enter Your FirstName:
//John
//Enter Your Middle Name/Initial
//C.
//Enter Your Last Name
//Smith
//Your Name is is John C. Smith

fun main (){
    println("Enter your firstName:")
    var firstName : String = readln()

    println("Enter your Middle Name/Initial")
    var middleName : String = readln()

    println("Enter your Lastname:")
    var lastName : String =readln()

    println("Your Name is $firstName $middleName $lastName")


}