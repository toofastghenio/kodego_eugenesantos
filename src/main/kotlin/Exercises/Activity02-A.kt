package Exercises

fun main() {
    var bsCivilEngStudents = arrayOf("Cardo Dalisay", "Eugene Santos", "Narda Darna")
    var bsChemicalEngStudents = arrayOf("Dalisay Cardo", "Jimmy Santos", "Vic Sotto")
    var bsMechanicalEngStudents = arrayOf("Marc Pingris", "Rendon Labador", "Calvin Abueva")
    var bsChemicalEngStudents1info: String = "Enrolled SY: 2022-2023, Birthdate: January 29, 1982"
    var bsChemicalEngStudents1grade = arrayListOf("First Grading: 95, Second Grading: 98, Third Grading: 95")
    var bsChemicalEngStudents2info = "Enrolled SY: 2022-2023, Birthdate: December 25, 1990"
    var bsChemicalEngStudents2grade = arrayListOf("First Grading: 98, Second Grading: 92, Third Grading: 95")
    var bsChemicalEngStudents3info = "Enrolled SY: 2022-2023, Birthdate: September 8, 1985"
    var bsChemicalEngStudents3grade = arrayListOf("First Grading: 90, Second Grading: 95, Third Grading: 92")
    var bsCivilEngStudents1info: String = "Enrolled SY: 2022-2023, Birthdate: January 29, 1982"
    var bsCivilEngStudents1grade = arrayListOf("First Grading: 95, Second Grading: 98, Third Grading: 95")
    var bsCivilEngStudents2info = "Enrolled SY: 2022-2023, Birthdate: December 25, 1990"
    var bsCivilEngStudents2grade = arrayListOf("First Grading: 98, Second Grading: 92, Third Grading: 95")
    var bsCivilEngStudents3info = "Enrolled SY: 2022-2023, Birthdate: September 8, 1985"
    var bsCivilEngStudents3grade = arrayListOf("First Grading: 90, Second Grading: 95, Third Grading: 92")
    var courses: String = "BSCE, BSCHE, BSME"

    println("List of Courses:")
    println(courses)
    print("Select Name of Course to check the list of Students Enrolled:")
    var course: String = readln()
    if (course == "BSCE") {
        println(bsCivilEngStudents[0])
        println(bsCivilEngStudents[1])
        println(bsCivilEngStudents[2])
    } else if (course == "BSCHE") {
        println(bsChemicalEngStudents[0])
        println(bsChemicalEngStudents[1])
        println(bsChemicalEngStudents[2])
    } else //if (course == "BSME")
    {
        println(bsMechanicalEngStudents[0])
        println(bsMechanicalEngStudents[1])
        println(bsMechanicalEngStudents[2])
    }
    print("Do you want to Access Student School Records:")
    var response = readln()

    if (response == "YES") {
        print("Type Student Name:")
        var studentname = readln()

        if (studentname == bsCivilEngStudents[0]) {
            println(bsCivilEngStudents1info)
            println(bsCivilEngStudents1grade)
            print("Do you want to add Fourth Grading grade?")
            var answer = readln()
            if (answer == "Yes") {
                print("Fourth Grading Grade:")
                var forthgrading = readln()
                bsCivilEngStudents1grade.add("Forth Grading: $forthgrading")
                println(bsCivilEngStudents1grade)
            }
        } else if (studentname == bsCivilEngStudents[1]) {
            println(bsCivilEngStudents2info)
            println(bsCivilEngStudents2grade)
            print("Do you want to add Fourth Grading grade?")
            var answer = readln()
            if (answer == "Yes") {
                print("Forth Grading Grade:")
                var fourthgrading = readln()
                bsCivilEngStudents2grade.add("Fourth Grading: $fourthgrading")
                println(bsCivilEngStudents2grade)

            } else {
                if (studentname == bsCivilEngStudents[2]) {
                    println(bsCivilEngStudents3info)
                    println(bsCivilEngStudents3grade)
                    print("Do you want to add Fourth Grading grade?")
                    var answer = readln()
                    if (answer == "Yes") {
                        print("Fourth Grading Grade:")
                        var fourthgrading = readln()
                        bsCivilEngStudents3grade.add("Fourth Grading: $fourthgrading")
                        println(bsCivilEngStudents3grade)

                        if (studentname == bsChemicalEngStudents[0]) {
                            println(bsChemicalEngStudents1info)
                            println(bsChemicalEngStudents1grade)
                            print("Do you want to add Fourth Grading grade?")
                            var answer = readln()
                            if (answer == "Yes") {
                                print("Fourth Grading Grade:")
                                var forthgrading = readln()
                                bsChemicalEngStudents1grade.add("Forth Grading: $forthgrading")
                                println(bsChemicalEngStudents1grade)

                            } else {
                                if (studentname == bsChemicalEngStudents[1]) {
                                    println(bsChemicalEngStudents2info)
                                    println(bsChemicalEngStudents2grade)
                                    print("Do you want to add Fourth Grading grade?")
                                    var answer = readln()
                                    if (answer == "Yes") {
                                        print("Forth Grading Grade:")
                                        var fourthgrading = readln()
                                        bsChemicalEngStudents2grade.add("Fourth Grading: $fourthgrading")
                                        println(bsChemicalEngStudents2grade)
                                    }
                                } else {
                                    if (studentname == bsChemicalEngStudents[2]) {
                                        println(bsChemicalEngStudents3info)
                                        println(bsChemicalEngStudents3grade)
                                        print("Do you want to add Fourth Grading grade?")
                                        var answer = readln()
                                        if (answer == "Yes")
                                            print("Fourth Grading Grade:")
                                        var fourthgrading = readln()
                                        val add = bsChemicalEngStudents3grade.add("Fourth Grading: $fourthgrading")
                                        println(message = bsChemicalEngStudents3grade)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

//Implement Activity 01 -  A using data structure.
//tasked to create a directory of the students taking this course