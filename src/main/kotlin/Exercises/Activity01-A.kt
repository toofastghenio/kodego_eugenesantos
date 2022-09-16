package exerciseActivity

//tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
// There is also a need to know the progress of the students during the progress of this course.

fun main(){
    var fullname1 = "Eugene Santos"
    var fullname2 = "Cardo Dalisay"
    var fullname3 = "Narda Darna"
    var finalgrade1 :Int = 98
    var finalgrade2 :Int = 85
    var finalgrade3 :Int = 75
    //  var isStudent :Boolean = true


    println("Students enrolled in Kodego")
    println("Name of Students:")
    print("$fullname1, ")
    //  println("is Enrolled = isStudent")
    println("Your Final Grade is $finalgrade1")
    if (finalgrade1 >=75) {
        println("Passed")
    }
    else {
        println("Failed")
    }

    print("$fullname2, ")
    //  println("is Enrolled = $isStudent")
    println("Your Final Grade is $finalgrade2")
    if (finalgrade2 >=75)
    {
        println("Passed")
    }
    else {
        println("Failed")
    }

    print("$fullname3, ")
    //   println("is Enrolled = $isStudent")
    println("Your Final Grade is $finalgrade3")
    if (finalgrade3 >=75)
    {
        println("Passed")
    }
    else {
        println("Failed")
    }
    print("-------End-------")
}