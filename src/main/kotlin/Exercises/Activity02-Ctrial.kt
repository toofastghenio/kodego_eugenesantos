package Exercises
//Implement Activity 01 - C using data structure.
//Tasked to automate an inventory system for a grocery.
fun main() {
    var items = arrayListOf("Produce Items, Pantry and Dairy Items, Meat and Spices")
    var produceitems = arrayListOf(
        "potatoes, onions, tomatoes, green peppers, celery, carrots and lettuce. Packaged, chopped lettuces are convenient for salads. \n" +
                "Fruits = apples, oranges, bananas, grapes, raisins and peaches. canned fruits"
    )
    var pantrydairyitems =
        arrayListOf("canned goods, grains, bread, tortilla wraps, rice, hot cereals and cold cereals, macaroni and cheese, spaghetti, peanut , eggs, cheese, yogurt, sour cream, orange juice, butter, jelly, sugar, flour, coffee, milk and tea")
    var meat = arrayListOf("pork, beef, chicken, lamb")
    var spices =
        arrayListOf("black pepper, salt, garlic powder, onion powder and paprika. Basil, oregano, rosemary and thyme, cocoa powder, cinnamon, cloves, ginger and nutmeg, lemon juice, vinegar, cooking oil and vanilla")

    println("List of Items:")
    println("$items")
    println()
    print("Select an Item:")
    var item = readln()

    if (item == "Produce Item") {
        println("Produce Item List:")
        println(produceitems)
        print("Do you want to add an items:")
        var answer = readln()
        if (answer == "Yes") {
            print("Add an item:")
            var additem = readln()
            produceitems.add("$additem")
            println(produceitems)
        } else if (item == "Pantry and Dairy Items") {
            println("Pantry and Dairy Items List:")
            println(pantrydairyitems)
            print("Do you want to add an item?")
            var answer1 = "Yes"
            if (answer1 == "Yes") {
                print("Add an item:")
                var additem1 = readln()
                pantrydairyitems.add("$additem1")
                println(pantrydairyitems)
            }
        } else if (item == "Meat") {
            println("Meat:")
            println(meat)
            print("Do you want to add an item:")
            var answer2 = readln()
            if (answer2 == "Yes") {
            }

        }
    }
}