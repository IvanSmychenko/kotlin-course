package org.deloys.three.org.deploys.three.lessons.lesson07

fun main() {

    for (i: Int in 1..10) {
        println(i)
    }

    for (i: Int in 10 downTo 1) {
        println(i)
    }

    for (i: Int in 1..10 step 2) {
        println(i)
    }

    for (i: Int in 1 until 10) {
        println(i)
    }

    val range = 1..10
    for (i in range)
        println(i)


    var counter = 0
    while (counter++ < 10) {
        println(counter)
    }

    do {
        println(counter)
    } while (counter++ < 10)
}