package practiceActivity


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