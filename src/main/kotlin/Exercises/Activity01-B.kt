package exerciseActivity
//Activity 01 - B
//You are tasked to automate a school’s library. Identify the items that can be borrowed in a Library. After listing the different items, identify the characteristics of the items. Use the proper data types.


fun main(){
    var TypesOfBooks = "Horror,Romance,Fantasy,"

    var horrorfictionbooks = "Dracula\nFrankenstein\n" +
            "The Exorcist\nThe Silence of the Lambs\nAmerican Psycho\n"

    var romancenovelbooks = "The Notebook\nThe Proposal\n" +
            "Fifty Shades of Grey\nRomeo and Juliet\nA Walk to Remember\nSense and Sensibility\n"

    var fantasybooks = "The Lord of The Rings\nThe Hobbit\n" +
            "The Chronicles Of Narnia\nGames of Thrones\nThe Neverending Story\nThe Golden Compass\n"

    var HorrorBooks = "A Horror fiction book is a genre of fiction which is intended to frighten, scare or disgust" +
            "Horror is often divided into the sub-genres of psychological horror and supernatural horror"

    var RomanceNovelBooks = "A Romance Novel generally refers to a type of genre fiction novel which places its primary focus on a relationship and romantic love between two people "

    var FantasyBooks = "A Fantasy is a genre of specultive fiction involving magical elements sometimes inspired by Mythology and Folklore"


    println("Welcome to Eugene's Online Book Collection Library ")
    println()
    println("Types of Books")
    println("$TypesOfBooks")
    println()
    println("What is a Horror Books:")
    println("$HorrorBooks")
    println("Types of Horror Books:")
    println("$horrorfictionbooks")
    println()
    println("What is a Romance Novel Books:")
    println("$RomanceNovelBooks")
    println("Types of Romance Novel Book:")
    println("$romancenovelbooks")
    println()
    println("What is a Fantasy Books:")
    println("$FantasyBooks")
    println("Types of Fantasy Book:")
    println("$fantasybooks")
    println()
    println("Thank you for visiting Eugene's Online Book Collection Library")
}
