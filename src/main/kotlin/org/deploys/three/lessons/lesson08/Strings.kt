package org.deloys.three.org.deploys.three.lessons.lesson08

fun main() {
    //манипуляции со строками

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7) // "is fun"
    val subString2 = originalString.substring(3, 6) // "lin"

    val replacedString = originalString.replace("fun", "awesome") // "Kotlin is awesome"
    println(replacedString)
    val words = originalString.split(" ") // ["Kotlin", "is", "fun"]
    println(words)
}