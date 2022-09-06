package practiceActivity
//Practice Activity 3
//Design program AgeGroup that will determine if age belongs to underage, young adult, adult, senior. Under age is 1-17; young adult is from 18-30; adult is from 31-59; senior is from 60 or more. Display “Invalid age” for negative numbers.
//Sample Input/Output:
//Enter age: 24
//Young adult
fun main () {
    var age: Int = 31

    if ((age >= 1) && (age <= 17)) {
        println("underage")
    } else if ((age >= 18) && (age <= 30)) {
        println("young adult")
    } else if ((age >= 31) && (age <= 59)) {
        println("adult")
    } else if (age >= 60) {
        println("senior")
    }else{
    println("Invalid age")}

}