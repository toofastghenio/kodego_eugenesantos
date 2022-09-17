    fun main() {

        var mobilePhone = MyMobilePhone ("Huawei","Y7Pro",32,5.5,3)

        var mobilePhone2 = MyMobilePhone("Samsung","A51s",64,6.0,4)

        var mobilePhone3 = MyMobilePhone("Oppo","A01",128,6.5,6)

    }
    class MyMobilePhone(var brand: String, var modelName: String, var rom: Int, var screenSize: Double, var ram: Int) {

        init {
            println("Object Created!")
            println("******************")
            println()
            println("The Brand is $brand")
            println("The Model Name is $modelName")
            println("The Capacity Rom is $rom GB")
            println("The Screen Size is $screenSize inches")
            println("The Memory Ram is $ram GB")
        }
        //secondary constructor 1

    constructor(brand: String) : this(brand, "Y7Pro", 32, 5.5, 3)


    }
