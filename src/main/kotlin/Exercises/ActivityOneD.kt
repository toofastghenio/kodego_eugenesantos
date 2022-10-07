package Exercises

class ActivityOneD {

    var amount: Int

    constructor(amount: Int) {
        this.amount = amount
    }

    fun addAmount(amount: Int):Int{
        this.amount = this.amount + amount
        return this.amount
    }

    fun dividedBy(dividedBy: Int): Int {

        var quotient: Int = 0
        quotient = this.amount / dividedBy
        println()
        println("The Sum of the amount you entered is: ${this.amount}")
        println("The Total of ${this.amount} is Divided by $dividedBy = $quotient")

        return quotient
    }
}