package exerciseActivity


fun main (){
    //Food Products
    var foodCategory1 : String = "Dry Goods"
    var foodCategory2 : String = "Wet Goods"
    var foodCategory3 : String = "Dairy Goods"

    //Food Type
    var foodType1 : String = "Canned Goods"
    var foodType2 : String = "Meat Products"
    var foodType3 : String = "Milk"

    //Food Price
    var foodPrice1 : Double = 20.00
    var foodPrice2 : Double = 320.00
    var foodPrice3 : Double = 120.00

    //Food Stocks
    var foodStocks1 : Int = 150
    var foodStocks2 : Int = 200
    var foodStocks3 : Int = 300

    //Availability
    var food1 : Boolean = foodStocks1 > 0
    var food2 : Boolean = foodStocks2 > 0
    var food3 : Boolean = foodStocks3 > 0

    //total amounts
    var amount1 : Double = foodPrice1 * foodStocks1
    var amount2 : Double = foodPrice2 * foodStocks2
    var amount3 : Double = foodPrice3 * foodStocks3

    println("The $foodCategory2 is worth $foodPrice2 pesos and the are $foodStocks2 pcs available.")
    println("with total amount of $amount2 pesos.")
    println(food2)





}