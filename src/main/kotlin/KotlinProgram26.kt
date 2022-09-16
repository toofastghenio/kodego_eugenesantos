fun main(){
    var numbers = intArrayOf(0,0,0)

    for (i in 1..2){
        println("Enter Number ${i+1}")
        var num = readln().toInt()
        numbers[i] = num
    }
    println(total(*numbers)) //4,5,1

}

fun total(vararg numbers:Int): Int{
    var total : Int = 0
    for (value in numbers){
        total = total + value
    }
    return total
}