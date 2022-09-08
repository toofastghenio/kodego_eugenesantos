package exercises
//Activity 01 - F
//Create an application that will accept 1 string. Your application will print “Palindrome” if the string is a palindrome.
fun main(args: Array<String>) {
    var num = 1001001
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = num

    // reversed integer is stored in variable
    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger)
        println("$originalInteger is a palindrome.")
    else
        println("$originalInteger is not a palindrome.")
}
    //First, given number (num)'s value is stored in another integer variable, originalInteger. This is because, we need to compare the values of reversed number and original number at the end.
    //Then, a while loop is used to loop through num until it is equal to 0.
    //On each iteration, the last digit of num is stored in remainder.
    //Then, remainder is added to reversedInteger such that it is added to the next place value (multiplication by 10).
    //Then, the last digit is removed from num after division by 10.
    //Finally, reversedInteger and originalInteger are compared. If equal, it is a palindrome number. If not, it isn't.
//num	    num != 0	    remainder	    reversedInteger
//363	    true	            3	        0 * 10 + 3 = 3
//36	    true	            6	        3 * 10 + 6 = 63
//3	        true	            3	        36 * 10 + 3 = 363
//0	        false	            -	        363