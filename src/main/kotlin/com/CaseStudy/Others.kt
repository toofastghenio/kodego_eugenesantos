package com.CaseStudy

interface Others {
    open fun schedule(schedule:String){
        println("Your Schedule is: $schedule")
    }
    open fun department(dept:String){
        println("Your Department is: $dept")
    }
}