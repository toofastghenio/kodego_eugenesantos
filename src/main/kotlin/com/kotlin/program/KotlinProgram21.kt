fun main(){

    //instantiation - process of creating an object
    var myObject = MyClass("Hello World!")
    var myObject2 = MyClass("hi World!")
    var myGenericObject = MyGenericClass( true)

}
//Generics
class MyGenericClass<T>(value:T ){
    init{
        println(value.toString().length)
    }
}
class MyClass(value: String){
    init{
        println(value.length)

    }
}





/*
Class -> objects
object -> variable
       -> functions(process)
uppercase -> first letter
examples.
String
Int





 */