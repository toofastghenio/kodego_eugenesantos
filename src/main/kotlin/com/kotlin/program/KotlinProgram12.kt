fun main (){
   var myString: String? = "Hello Kotlin"

//    println(myString)

    // ?.let{}
  var count = myString?.let{2+2}
    println(count)

    //elvis operator ?:
   val count2 = myString?.length ?: -5
   println(count2)

    //!!
    val count3 = myString!!.length
    println(count3)
}