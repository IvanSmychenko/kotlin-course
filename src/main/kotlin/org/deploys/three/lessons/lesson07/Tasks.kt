package org.deloys.three.org.deploys.three.lessons.lesson07

fun main() {

    for (i in 10 downTo 1 step 3) {
        if (i % 2 == 0) {
            println(i*i)
        }
    }
    print("====================\n")

    val length: Int = 34
    for (i in 0 until length) {
        println(i)
    }
    print("====================\n")

    var counter: Int = 0
    var sum: Int = 0
    while (counter++ < 10) {
        sum+=counter
        counter++
    }
    println(sum)
    print("====================\n")

    var counter2: Int = 0
    var sum2: Int = 0
    do {
        counter2 ++
        sum2+=counter2
        println(sum2)
    } while ((sum2 + counter2) <= 50)
    print("====================\n")

    var counter3: Int = 1
    while (true) {
        println(counter3)
        if (counter3++ % 7 == 0) break
    }
    print("====================\n")

    for (i in 1..10) {
        if (i == 3 || i == 7) continue
        println(i)
    }
    print("====================\n")

    var counter4: Int = 0
    for (i in 20 downTo 1) {
        counter4++
        if (counter4 == 4) {
            counter4 = 0
            continue
        }
        println(i)
    }
    print("====================\n")
}