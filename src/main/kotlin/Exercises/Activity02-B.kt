package Exercises
//Tasked to automate a school’s library.
fun main(){
    var Items = "Fiction Books, Non-Fiction Books"
    var fictionbooks = mapOf(1 to "Romeo and Juliet", 2 to "Peter Pan, untold series", 3 to "Science and Beyond", 4 to "Conjuring Series of Stories Second Edition", 5 to "The Bureau of Magical Things")
    var nonfictionbooks = mapOf(1 to "Jose Rizal Biography/Autobiography", 2 to  "Memoirs by Elizabeth Gilbert", 3 to "How to Overcome Frustrations", 4 to "The Power of Prayers", 5 to "World Encyclopedias", 6 to "Wiki Dictionary and Terms")
    var FictionBooks = "A fictional book is a text created specifically for a work in an imaginary narrative that is referred to, depicted, " +
            "or excerpted in a story, book, film, or other fictional work, and which exists only in one or more fictional works. " +
            "A fictional book may be created to add realism or depth to a larger fictional work."
    var NonFictionBooks = "Nonfiction books are based on factual information or real-life events. " +
            "It makes the declaration that it is not fiction because the reader should understand that what is contained inside the book is not imagined and has a basis in the real world."

    println("Automated Public Library")
    println("Kinds of Books: $Items")
    println()
    println(FictionBooks)
    println()
    println(NonFictionBooks)
    println()
    println("List of Fictional Books:")
    println(fictionbooks)
    println()
    println("List of NonFictional Books:")
    println(nonfictionbooks)
    println()
    print("Do you want to borrow a book?")
    var answer = readln()
    if (answer == "Yes"){
        print("Type you Name:")
        var name = readln()
        print("Name of Book:")
        var book = readln()
        if (book == fictionbooks[2]){
            println("You successfully borrowed a book. Fictional Books must be returned within 7 days from date borrowed")
        }
        else if (book == fictionbooks[3]) {
            println("You successfully borrowed a book. Fictional Books must be returned within 7 days from date borrowed")
        }
        else if (book == nonfictionbooks[4]){
            println("You successfully borrowed a book. Non-Fictional Books must be returned within 3 days from date borrowed")
        }
        else if (book == nonfictionbooks[3]) {
            println("You successfully borrowed a book. Non-Fictional Books must be returned within 3 days from date borrowed")
        }
        else {
            println("Book not available. Try another books.")
        }
    }
}