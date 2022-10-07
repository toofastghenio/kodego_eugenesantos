package grocerystore

fun main() {
    var groceryStuff = Groceries()
    print("*-*-*-*-*-*EUGENE'S ONLINE GROCERY*-*-*-*-*\n")
    while (true) {
        print(
                    "[1]:Add Product\n" +
                    "[2]:Proceed to Inventory\n" +
                    "[3]:Quit\n" +
                    "Choose: \n"
        )
        try {
            var choose1 = readln()
            // Check input and compare to conditions
            if (choose1.length > 1) {
                //select .length control input
                throw Exception()
            } else if (choose1.toInt() == 1) {
                println("*-*ADD PRODUCT*-*")
                println("[1]:Confectionary[2]:Snacks[3]:Frozen Goods")
                print("Choose Classification:")
                var figure = readln().toInt()
                if (figure == 1) {
                    println("*-*-*Confectionary*-*-*")
                    print("Product Name:")
                    var name = readln().uppercase()
                    groceryStuff.product1.add(name)
                    print("Product Price:")
                    var price = readln().toDouble()
                    groceryStuff.price1.add(price)
                    print("Product Supplies:")
                    var supplies = readln().toInt()
                    groceryStuff.supplies1.add(supplies)
                    println("Done adding the Products")
                    continue
                } else if (figure == 2) {
                    println("*-*-*Snacks*-*-*")
                    print("Product Name:")
                    var name = readln().uppercase()
                    groceryStuff.product2.add(name)
                    print("Product Price:")
                    var price = readln().toDouble()
                    groceryStuff.price2.add(price)
                    print("Product Supplies:")
                    var supplies = readln().toInt()
                    groceryStuff.supplies2.add(supplies)
                    println("Done adding the Products")
                    continue
                } else if (figure == 3) {
                    println("*-*-*Frozen Foods*-*-*")
                    print("Product Name:")
                    var name = readln().uppercase()
                    groceryStuff.product3.add(name)
                    print("Product Price:")
                    var price = readln().toDouble()
                    groceryStuff.price3.add(price)
                    print("Product Supplies:")
                    var supplies = readln().toInt()
                    groceryStuff.supplies3.add(supplies)
                    println("Done adding the Products")
                    continue
                } else println("Incorrect Figure!")
                break
                // inventory
            } else if (choose1.toInt() == 2) {
                groceryStuff.listOfProducts()
                //Quit
            } else if (choose1.toInt() == 3) {
                println("Quit")
                break
            } else {
                println("Incorrect  Figure!")
            }
            groceryStuff.announcement()
            groceryStuff.details()
        } catch (e: Exception) {
            println("Incorrect Figures")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("Incorrect Figures")
        }
    }   }