package com.CaseStudy

open class Students:Person(),Others {
    init {
        println("*-*-*Students*-*-*")
    }
    fun curriculums (curriculums:String){
        println("Curriculums are $curriculums")
    }
}