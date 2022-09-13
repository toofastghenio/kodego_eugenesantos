package practice_activities

import java.awt.Rectangle

//Create a kotlin program called PracticeActivity7.kt that computes the perimeter and area of a rectangle. Designate functions calculatePerimeter() and calculateArea() that will facilitate the computation of values. No println() or display of output should be seen inside these functions.
//
//Sample Input/Method
//Enter length: 4.5
//Enter width: 2.0
//
//
//Perimeter is 13.00 meters
//Area is 9.00 meters

fun main() {

    var l = 4.5
    var w = 2.0

    var area: Double = l * w

    var l2 = 4.5
    var w2 = 2.0

    var perimeter: Double = l2 + w2 + l2 + w2

    println("Perimeter of Rectangle is $perimeter")

    println("Area of Rectangle is: $area")
}


