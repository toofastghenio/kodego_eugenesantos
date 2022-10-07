package com

class GroceryItems(var name:String,tastetest:String ) {

    constructor(name: String,tastetest: String,response:String) : this(name,tastetest){
        println("The customer on fruit $name is this [ ")
    }
}