fun main() {
    val purchaseAmount = 1001
    val isRegularCustomer = true
    var discount = 0
    var finalAmount = purchaseAmount

    if (purchaseAmount > 0 && purchaseAmount <= 1000) {
        discount = 0
    } else if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
        finalAmount -= 100
    } else if (purchaseAmount > 10000) {
        finalAmount -= (purchaseAmount * 0.05).toInt()
    }

    if (isRegularCustomer) {
        finalAmount -= (finalAmount * 0.01).toInt()
    }


    println("Цена с учетом скидок: " + finalAmount + " рублей")
}