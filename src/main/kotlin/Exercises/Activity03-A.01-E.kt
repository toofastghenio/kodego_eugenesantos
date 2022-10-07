package Exercises
//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F
fun main() {
var uniqueWord1 = mutableListOf<Char>()
var uniqueWord2 = mutableListOf<Char>()

try {
    println("Please enter first unique word: ")
    var string1: String = readln().toString().lowercase()
    var string1length = string1.length

    var ctr1: Int = 0
    while (ctr1 <= string1length - 1) {
        uniqueWord1.add(string1[ctr1])
        print(string1[ctr1])

        ctr1++
    }
}catch (e:Exception){
    println("Please enter a valid unique word")
}

try {
    println()
    println("Please enter second unique word: ")
    var string2: String = readln().toString().lowercase()
    var string2length = string2.length

    var ctr2: Int = 0
    while (ctr2 <= string2length - 1) {
        uniqueWord2.add(string2[ctr2])
        print(string2[ctr2])

        ctr2++
    }
}catch (e:Exception){
    println("Please enter a valid unique word")
}

println()
println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
println("The words you input are $uniqueWord1 & $uniqueWord2")
println()
println("The Unique characters are the following:")
println("Unique Word1")
println(uniqueWord1 subtract uniqueWord2)
if(uniqueWord1 subtract uniqueWord2 != uniqueWord2 subtract uniqueWord1){

}else {
    println("- There is No Unique Characters! -")
}
println("Second Word")
println(uniqueWord2 subtract uniqueWord1)
if(uniqueWord1 subtract uniqueWord2 != uniqueWord2 subtract uniqueWord1){

}else {
    println("- There is No Unique Characters! -")
}
println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")

println("---Line ends here---")

}