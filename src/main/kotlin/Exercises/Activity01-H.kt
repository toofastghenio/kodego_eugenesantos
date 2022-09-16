package exercises
//Activity 01 - H
//Using Activity 01 - B and Implement a process where someone can borrow a book.
fun main() {

    var TypesOfBooks = "Horror or Romance Novel,"

    var horrorfictionbooks = "Dracula\nFrankenstein\n" +
            "The Exorcist\nThe Silence of the Lambs\nAmerican Psycho\n"

    var romancenovelbooks = "The Notebook\nThe Proposal\n" +
            "Fifty Shades of Grey\nRomeo and Juliet\nA Walk to Remember\nSense and Sensibility\n"

        var HorrorBooks = "A Horror fiction book is a genre of fiction which is intended to frighten, scare or disgust" +
            "Horror is often divided into the sub-genres of psychological horror and supernatural horror"

    var RomanceNovelBooks = "A Romance Novel generally refers to a type of genre fiction novel which places its primary focus on a relationship and romantic love between two people "


    println("Welcome to Welcome to Eugene's Online Book Collection Library")
    println()
    println("Types of Books Available as of Today") //The Books are always available
    println("$TypesOfBooks")
    println()
    println("What is a Horror Books:")
    println("$HorrorBooks")
    println("Types of Horror Books:")
    println("$horrorfictionbooks")
    println()
    println("What is a Romance Novel Books:")
    println("$RomanceNovelBooks")
    println("Types of Non-Fiction Book:")
    println("$romancenovelbooks")
    println()

    var answer: String = "Yes"


    print("Do you want to borrow a book/s?")
    var ans: String = readln()

    while (answer == "Yes")
     {
        println("What book/s do you want to borrow? Horror or Romance Novel?")
        var answer1 = readln()
        if (answer1 == "Horror") {
            println(horrorfictionbooks)
            print("What Horror Books? =")
            var chosenbook = readln()
            print("Full Name:")
            var name = readln()
            println("All Horror Books should be returned within 7 days from date borrowed. Have a Nice Day")
            break
        } else if (answer1 == "Romance Novel") {
            println(romancenovelbooks)
            print("Which of the Romance Novel Books? =")
            var chosenbook1 = readln()
            print("Full Name:")
            var name1 = readln()
            println("All Romance Novel Books should be returned within 3 days from date borrowed. Have a Nice Day")
            break
        }
    }

    println("Thank you for visiting Eugene's Online Book Collection Library. Have a nice day! God Bless")
}
