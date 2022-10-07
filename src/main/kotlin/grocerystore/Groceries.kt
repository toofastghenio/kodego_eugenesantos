package grocerystore

class Groceries:Details,Announcement() {
    var product1 = arrayListOf<String>("SUGAR", "CHOCOLATES", "CANDIES")
    var product2 = arrayListOf<String>("CHIPS", "POPCORN", "COOKIES")
    var product3 = arrayListOf<String>("FROZEN PORK", "FROZEN CHICKEN", "FROZEN BEEF")
    var price1 = arrayListOf<Double>(50.0, 75.0, 30.0)
    var price2 = arrayListOf<Double>(25.0, 45.0, 15.0)
    var price3 = arrayListOf<Double>(350.0, 185.0, 450.0)
    var supplies1 = arrayListOf<Int>(60, 150, 325)
    var supplies2 = arrayListOf<Int>(80, 135, 235)
    var supplies3 = arrayListOf<Int>(200, 500, 300)


    fun addProduct1(product: String, price: Double, supplies: Int) {
        product1.add(product)
        price1.add(price)
        supplies1.add(supplies)
    }

    fun addProduct2(product: String, price: Double, supplies: Int) {
        product2.add(product)
        price2.add(price)
        supplies2.add(supplies)
    }

    fun addProduct3(product: String, price: Double, supplies: Int) {
        product3.add(product)
        price3.add(price)
        supplies3.add(supplies)
    }

    fun listOfProducts() {
        var counter = 0
        println("*-*-*Confectionary*-*-*")
        for (i in product1) {
            println("Product: $i\n Price: ${(price1[counter])}\nSupplies: ${supplies1[counter]}") // Moved back Supplies 1 space to remove spacing during run time
            counter++
        }
        println("*-*-*")
        var counter1 = 0
        println("*-*-*Snacks*-*-*")
        for (i in product2) {
            println("Product: $i\nPrice: ${(price2[counter1])}\nSupplies: ${supplies2[counter1]}") // Change counter to counter1
            counter1++
        }
        println("*-*-*")
        var counter2 = 0
        println("*-*-*FrozenGoods*-*-*")
        for (i in product3) { // Missing {

            println("Product: $i\nPrice: ${(price3[counter2])}\nSupplies: ${supplies3[counter2]}")  // Change counter to counter2
            counter2++ // Change counter to counter2
            println("*-*-*")
        } // Missing }
    }

    override fun announcement() {
        println("Thank you for trusting us")
    }

}