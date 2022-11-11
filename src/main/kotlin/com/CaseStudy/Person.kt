package com.CaseStudy

open class Person {
    var fullName = ""
    var age = 0
    var studentNumber = 0
    var type = ""
    open fun displayDetails(fullname:String,age:Int,studentNumber: Int,type:String){
        var newFullname = fullname
        var newAge =age
        var newstudentNumber:Int = studentNumber
        var newType = type

        println("Full Name: $newFullname\n Age: $newAge\n StudentNumber: $newstudentNumber\n Type: $newType")
    }
}