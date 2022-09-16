package exercises
fun main() {
    //Using Activity 01 - C and implement a process where items are added to the grocery.

    var items = "Confectionary, Vegetables and Cereals"
    var confectionaryitems =
        "Chocolates, Gums, Jellies, Hard Candy, Soft Candy, Cakes"
    var vegetablesitems =
        "Tomatoes, Potatoes,Spinach,Onions, Garlic, Eggplants"
    var cerealitems = "Corn Flakes, Bran, Granola, Rice Crispies, Oatmeal"


    println("Below are the list of available items")
    println("List of Items:")
    println("$items")
    println()
    var itemsNumber: Int = 2
    when (itemsNumber) {
        1 -> println("Confectionary Items available stocks: $confectionaryitems")
        2 -> println("Vegetables Items available stocks: $vegetablesitems")
        3 -> println("Cereals Items available stocks: $cerealitems")

    }
    var addeditem = ArrayList<String>()
    print("Added Item: ")
    addeditem.add("Lollipops")
    addeditem.add("Candy Cane")
    for(value in addeditem){
        print(" $value ")
    }
}