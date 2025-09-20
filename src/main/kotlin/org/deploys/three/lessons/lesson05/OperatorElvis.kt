package org.deloys.three.org.deploys.three.lessons.lesson05

fun main() {
    val userLang: String? = "null"
    val defaultLang = "English"
    val currentLang = userLang ?: defaultLang
    println(currentLang)

    val innerAccumulator = 5000
    val externalAccumulator: Int? = 2000
    val powerBank = innerAccumulator + (externalAccumulator ?: 0)
    println(powerBank)

    val goodsInContainer: String? = null
    val checkedGoods = goodsInContainer ?: "Goods not found"
    println(checkedGoods)

    val price = 80.0
    val discountInPercent: Double? = null
    val discount = (discountInPercent ?: 0.0) / 100
    val discountPrice = price - price * discount
    println(discountPrice)
}