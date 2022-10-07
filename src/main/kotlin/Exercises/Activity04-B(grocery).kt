package Exercises
//Activity 04 - B
//
//Implement Activity 01 - C using OOP use all OOP concepts
open class GroceryItem(var name: String, var price: Int)

class Pasta(vararg var kind: String) : GroceryItem("Pasta", 50) {
    override fun toString(): String {
        if (kind.isEmpty()) {
            return "$name Ladys Choice"
        } else {
            return name + " " + kind.joinToString()
        }
    }
}
    class Fruit(vararg var kind: String) : GroceryItem("Fruit", 60) {
        override fun toString(): String {
            if (kind.isEmpty()) {
                return "$name Best Food"
            } else {
                return name + " " + kind.joinToString()
            }
        }
    }
    class Order(var orderNumber: Int) {
        private var itemList = mutableListOf<GroceryItem>()

        fun addItem(newItem: GroceryItem): Order {
            itemList.add(newItem)
            return this
        }

        fun addAll(newItems: List<GroceryItem>): Order {
            itemList.addAll(newItems)
            return this
        }

        fun print() {
            println("Order #${orderNumber}")
            var total = 0
            for (item in itemList) {
                println("${item}: Php${item.price}")
                total += item.price
            }
            println("Total: Php${total}")
        }
    }

    fun main() {
        var ordersList = mutableListOf<Order>()

        // Add an item to an order
        var order1 = Order(1)
        order1.addItem(Pasta())
        ordersList.add(order1)

        // Add multiple items individually
        var order2 = Order(2)
        order2.addItem(Pasta())
        order2.addItem(Fruit())
        ordersList.add(order2)

        // Add a list of items at one time
        var order3 = Order(3)
        var items = listOf(Pasta("Macaroni","Penne","Spaghetti" ), Fruit("Apple", "Orange", "Banana"))
        order3.addAll(items)
        ordersList.add(order3)

        // Use builder pattern
        var order4 = Order(4)
            .addItem(Pasta())
            .addItem(Fruit("Grapes", "Strawberry"))
        ordersList.add(order4)

        // Create and add order directly
        ordersList.add(
            Order(5)
                .addItem(Pasta())
                .addItem(Pasta())
                .addItem(Fruit("Guava"))
        )

        // Print out each order
        for (order in ordersList) {
            order.print()
            println()
        }
    }
