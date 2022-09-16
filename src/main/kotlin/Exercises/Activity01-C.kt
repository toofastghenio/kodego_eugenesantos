package exerciseActivity
//Activity 01 - C
//You are tasked to automate an inventory system for a grocery.. Identify the items that can be bought in a grocery store. After listing the different items, identify the characteristics of the items.You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.

fun main (){
    //Food Products
    var categoryOfFood1 : String = "Confectionary"
    var categoryOfFood2 : String = "Vegetables"
    var categoryOfFood3 : String = "Cereal"

    //Food Type
    var typeOfFood1 : String = "Muscavado"
    var typeOfFood2 : String = "Tomato"
    var typeOfFood3 : String = "Corn Flakes"

    //Food Price
    var priceOfFood1 : Double = 150.00
    var priceOfFood2 : Double = 80.00
    var priceOfFood3 : Double = 130.00

    //Food Stocks
    var stocksofFood1 : Int = 500
    var stocksofFood2 : Int = 800
    var stocksofFood3 : Int = 1200

    //Availability
    var item1 : Boolean = stocksofFood1 > 0
    var item2 : Boolean = stocksofFood2 > 0
    var item3 : Boolean = stocksofFood3 > 0

    //total amounts
    var amount1 : Double = priceOfFood1 * stocksofFood1
    var amount2 : Double = priceOfFood2 * stocksofFood2
    var amount3 : Double = priceOfFood3 * stocksofFood3

    println("The $categoryOfFood2 is worth $priceOfFood2 pesos and the are $stocksofFood2 pcs available.")
    println("with total amount of $amount2 pesos.")
    println(item2)





}