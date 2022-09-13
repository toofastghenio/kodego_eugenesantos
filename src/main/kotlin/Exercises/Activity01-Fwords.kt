package exercises
//Activity 01 - F
//Create an application that will accept 1 string. Your application will print “Palindrome” if the string is a palindrome.
    fun main () {
    println("-----------------------")
    println("Phrase: \"racecar\"")
    println("isPalindrome : ${isPalindrome("racecar")}")
    println("-----------------------")
    println("Phrase: \"jello\"")
    println("isPalindrome : ${isPalindrome("jello")}")
}

    fun isPalindrome(text: String): Boolean {
        return text == text.reversed()

    }



