package Exercises
// I created one class that stores the data of a student : name , age and rank
// This class holds one constructor and getter/setter only for three elements.
data class Student(var name: String , var age: Int, var rank: Int)
fun main(args: Array<String>) {
    //Copy object using copy()
    var student1 = Student("Cardo Dalisay", 38, 3)
    println("student1 name : ${student1.name} , age : ${student1.age} , rank : ${student1.rank}")
    println()

    var student2 = Student(name = "Eugene Santos", 40, 1)
    println("student2 name : ${student2.name} , age : ${student2.age} , rank : ${student2.rank}")
    println()

    var student3 = Student(name = "Narda Custodio", 18, 2)
    println("student3 name : ${student3.name} , age : ${student3.age} , rank : ${student3.rank}")
    println()


    //String value using toString() :
    var student4 = Student("Vic Sotto", 62, 4)
    println(student4.toString())
    println()

    var student5 = Student("Dalisay Cardo", 25, 5)
    println(student5.toString())
    println()

    var student6 = Student("Jimmy Santos", 65, 6)
    println(student6.toString())
    println()

     //set different rank
    var Cardo = Student("Cardo Dalisay", 38,3)
    println("name = ${student1.name}")
    println("current rank : ${student1.rank}")
    println()

    //Declaring properties in the Class body
    // I created one data class with three parameters in the constructor.
    //We can have one property in the constructor and declaring the other two inside the class.
    data class Student(var name: String){
        var rank: Int = 0
    }

        var markpingris = Student("Mark Pingris")
        markpingris.rank = 7

        println("name = ${markpingris.name}")
        println("rank : ${markpingris.rank}")
        println()

        var rendon = Student("Rendon Labador")
        rendon.rank = 8

        println("name = ${rendon.name}")
        println("rank : ${rendon.rank}")
        println()

        var calvin = Student("Calvin Abueva")
        calvin.rank = 9

        println("name = ${calvin.name}")
        println("rank : ${calvin.rank}")
        println()
    }





