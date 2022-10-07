package Exercises
//Activity 04 - A
//
//Implement Activity 01 - B using OOP use all OOP concepts

fun main(){
    /*Activity 03 - B
    Create JUnit test for Activity 01 - D
    */

    var activityOneD = ActivityOneD(0)

    var mainLoop : Boolean = true
    while (mainLoop){
        try{
            print("[#]Enter an Amount: ")
            activityOneD.addAmount(readln().toInt())

            var secondLoop : Boolean = true
            while (secondLoop){
                println("[?]Do you want to add another amount?[Yes/No] ")
                var addAntoher : String = readln().lowercase()
                println()

                if (addAntoher == "no"){
                    print("[#]Divide by how many? ")
                    activityOneD.dividedBy(readln().toInt())

                    mainLoop = false
                    secondLoop = false
                }else if((addAntoher != "no") && (addAntoher != "yes")){
                    println("[!]Invalid! Please choose between Yes or No.")
                }else{
                    secondLoop = false
                }
            }

        }catch(e : NumberFormatException){
            println("[!]Error: Input Digits Only!")
            println()
        }
    }
}

//JUnit Test = ./src/test/kotlin/Exercises/ActivityOneDTest.kt