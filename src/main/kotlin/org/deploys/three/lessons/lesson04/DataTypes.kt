package org.deloys.three.org.deploys.three.lessons.lesson04

val myInt: Int = 5
val myFloat: Float = 0.58F
val myLong: Long = 1_234_567_890L
val myShort: Short = 32000
val myByte: Byte = 120
val myDouble: Double = 5.99
val isKotlinFun: Boolean = true
val letter: Char = 'A'
val text: String = "Hello, Kotlin!"

val numbers: Array<Int> = arrayOf(1, 2, 3)
val string: List<String> = listOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)

val keysToValues: Map<Int, String> = mapOf(
    1 to "Значение 1",
    1 to "Значение 2",
)

fun main() {
    val r: Float = myInt + myFloat
}

fun example(): Nothing {
    throw RuntimeException("")
}

var something: Any = "24"

fun change() {
    something = 24
    something = true
    something = ArrayList<String>()
}