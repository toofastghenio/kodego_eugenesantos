fun main(){
    var string1 : String = "this is my String"
    var string2 : String = "this is my String too!"
    //string character
    println(string1[11])
    //string length
    println(string1.length)
    println(string2.length)
    //string equality
    println(string1==string2)
    //string uppercase/lowercase
    println(string2.uppercase())
    //string uppercase/lowercase
    println(string2.lowercase())
    //startswith
    println(string2.startsWith("tha"))
    //endswith
    println(string2.endsWith("too!"))
    //concatenate
    println(string1+"  "+string2)
    //substring
    println(string1.substring(7,11))

}