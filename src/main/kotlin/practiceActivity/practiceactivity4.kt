package practice_activities

fun main(){
    println()

    println("Enter product:")
    var itemName : String = readln()

    println("Enter price:")
    var item1Price = readln().toDouble()
    println("Price of the $itemName is $item1Price")


    //discount computation
    var lessFormula1: Double =(item1Price* 0.0)
    var lessFormula2: Double =(item1Price*0.05)
    var lessFormula3: Double =(item1Price*0.10)
    var lessFormula4: Double =(item1Price*0.15)
    var lessFormula5: Double =(item1Price*0.20)

    //net price computation
    var netPrice1: Double =(item1Price*0.0)
    var netPrice2: Double =(item1Price*0.95)
    var netPrice3: Double =(item1Price*0.90)
    var netPrice4: Double =(item1Price*0.85)
    var netPrice5: Double =(item1Price*0.80)

    if((item1Price >= 0)&&(item1Price <= 10000)){
        println("Discount is $lessFormula1")
    }else if((item1Price >=10001)&&(item1Price <=20000)){
        println("Discount is $lessFormula2")
    }else if ((item1Price >=20001)&&(item1Price <=50000)){
        println("Discount is $lessFormula3")
    }else if ((item1Price >=50001)&&(item1Price <=100000)){
        println("Discount is $lessFormula4")
    }else if ((item1Price > 100000)){
        println("Discount is $lessFormula5")
    }else{
        println("Invalid price!")
    }

    if((item1Price >= 0)&&(item1Price <= 10000)){
        println("Net Price is $netPrice1")
    }else if((item1Price >=10001)&&(item1Price <=20000)){
        println("Net Price is $netPrice2")
    }else if ((item1Price >=20001)&&(item1Price <=50000)){
        println("Net Price is $netPrice3")
    }else if ((item1Price >=50001)&&(item1Price <=100000)){
        println("Net Price is $netPrice4")
    }else if ((item1Price > 100000)){
        println("Net Price is $netPrice5")
    }else{
        println("Invalid price!")
    }


}
