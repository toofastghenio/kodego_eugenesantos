package practice_activity6
//Rewrite Activity-01 F so that its implements a function
//fun main(){
//    println("Enter String: ")
//    var input : String = readln()
//    palindromeChecker(input)
//}
//
//fun palindromeChecker(input:String){
////logic
//}
fun main() {
    println("Enter String: ")
    var input: String = readln()
    palindromeChecker(input)
}

fun palindromeChecker(input:String){
    var string1 = input.uppercase()
    var reverse = string1.reversed()

    if (string1 == reverse){

    }


}