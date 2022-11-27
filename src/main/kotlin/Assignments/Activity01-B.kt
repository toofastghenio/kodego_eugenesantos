package Assignments

//You are tasked to automate a school’s library.
//
//Identify the items that can be borrowed in a Library.
//
//After listing the different items, identify the characteristics of the items.
//
//Use the proper data types.

fun main(){

    var bookCode1: String = "OWSK2010"
    var bookName1: String = "On Writing"
    var bookWriter1: String = "Stephen King"
    var bookYearPublished1: Int = 2010
    var bookavailability1: Boolean = true

    var bookCode2: String = "BBAL1995"
    var bookName2: String = "Bird by Bird"
    var bookWriter2: String = "Anne Lamott"
    var bookYearPublished2: Int = 1995
    var bookavailability2: Boolean = false


    var bookCode3: String = "WMRLB2021"
    var bookName3: String = "Writer's Market"
    var bookWriter3: String = "Robert Lee Brower"
    var bookYearPublished3: Int = 2021
    var bookavailability3: Boolean = true

    var bookCode4: String = "TAPSTAP2020"
    var bookName4: String = "The Associated Press Stylebook"
    var bookWriter4: String = "The Associated Press"
    var bookYearPublished4: Int = 2020
    var bookavailability4: Boolean = false


    var bookCode5: String = "WDTBNG2016"
    var bookName5: String = "Writing Down The Bones"
    var bookWriter5: String = "Natalie Goldberg"
    var bookYearPublished5: Int = 2016
    var bookavailability5: Boolean = true


    println("*******TOOFAST LIBRARY*******")
    println("List of Books:")
    println("*****************************")
    println(bookName1)
    println(bookName2)
    println(bookName3)
    println(bookName4)
    println(bookName5)
    println("*****************************")

    println()
    println("Kindly Input the Book Description :")
    var bookLabel: String = readln()

//  println("Book Description: $bookLabel")
    println("*****************************")


    if (bookLabel == bookName1) {
        println("Book Code      : $bookCode1")
        println("Book Label     : $bookName1")
        println("Book Writer    : $bookWriter1")
        println("Book Published : $bookYearPublished1")
        println("Book Available : $bookavailability1")
    }

    if (bookLabel == bookName2) {
        println("Book Code      : $bookCode2")
        println("Book Label     : $bookName2")
        println("Book Writer    : $bookWriter2")
        println("Book Published : $bookYearPublished2")
        println("Book Available : $bookavailability2")
    }

    if (bookLabel == bookName3) {
        println("Book Code      : $bookCode3")
        println("Book Label     : $bookName3")
        println("Book Writer    : $bookWriter3")
        println("Book Published : $bookYearPublished3")
        println("Book Available : $bookavailability3")
    }

    if (bookLabel == bookName4) {
        println("Book Code      : $bookCode4")
        println("Book Label     : $bookName4")
        println("Book Writer    : $bookWriter4")
        println("Book Published : $bookYearPublished4")
        println("Book Available : $bookavailability4")
    }

    if (bookLabel == bookName5) {
        println("Book Code      : $bookCode5")
        println("Book Label     : $bookName5")
        println("Book Writer    : $bookWriter5")
        println("Book Published : $bookYearPublished5")
        println("Book Available : $bookavailability5")
    }
println("*************************")
println("**********END**********")

}




