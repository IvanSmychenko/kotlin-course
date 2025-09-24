package org.deloys.three.org.deploys.three.lessons.lesson07

fun main() {

    for (i in 10 downTo 1 step 3) {
        if (i % 2 == 0) {
            println(i*i)
        }
    }

    val length: Int = 34
    for (i in 0 until length) {
        println(length)
    }
}