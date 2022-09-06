package practiceActivity
//Practice Activity 2
//Create a Kotlin program that will accept grades, then calculates and display their average grade.
//Sample Output
//Enter Grade in Math:
//78
//Enter  Grade in English:
//81
//Enter  Grade in Filipino:
//98
//Average Grade is: 85.66

fun main (){
    println("Enter grade in Math:")
    var Math : Double = readln().toDouble()

    println("Enter grade in English:")
    var English : Double = readln().toDouble()

    println("Enter grade in Filipino:")
    var Filipino : Double = readln().toDouble()

    var averageGrade : Double = (Math + English + Filipino) / 3


    println("Average Grade is =$averageGrade")


}