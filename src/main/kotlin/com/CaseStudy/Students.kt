package com.CaseStudy

open class Students:Person(),Others {
    init {
        println("*-*-*Students*-*-*")
    }
    fun course (course:String){
        println("Course is $course")
    }
}