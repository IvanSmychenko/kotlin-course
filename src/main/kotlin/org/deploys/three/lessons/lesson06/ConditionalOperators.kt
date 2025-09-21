package org.deloys.three.org.deploys.three.lessons.lesson06

fun main() {

    val number = 9
    if (number > 5) {
        println("Число больше 5")
    }

    if (number % 2 == 0) {
        println("Число четное")
    } else {
        println("Число нечетное")
    }

    if (number < 0) {
        println("Число отрицательное")
    } else if (number == 0) {
        println("Число равно 0")
    } else {
        println("Число положительное")
    }

    val intRange = 1..10
    val intRangeUntil = 1 until 10
    val downTo = 10 downTo 1
    val charRange = 'd'..'r'

    val inRange = 2 in intRange
    val notInRange = 2 !in intRange

    val score = 82
    when {
        score in 90..100 -> println("Отлично")
        score in 80..89 -> println("Хорошо")
        score in 70..79 -> println("Удовлетварительно")
        else -> println("Нужно подучить")
    }

    val a = 5
    val b = 6
    val max = if (a > b) {
        a
    } else {
        b
    }

    val result = when (score) {
        in 90..100 -> "Отлично"
        in 80..89 -> "Хорошо"
        in 70..79 -> "Удовлетварительно"
        else -> "Нужно подучить"
    }
    println(result)

    example1(19)

    example2(24, true)
}


fun example1(arg: Int) {
    when (arg) {
        in 0..5 -> println("night")
        in 6..11 -> println("morning")
        in 12..17 -> println("afternoon")
        in 18..23 -> println("evening")
        else -> println("Time is incorrect!")
    }
}


fun example2(temp: Int, rain: Boolean) {
    if (temp > 30 || temp < -30) {
        println("take a car")
    } else if (temp >= 15 && !rain) {
        println("have a walk")
    } else {
        println("take a bus")
    }
}