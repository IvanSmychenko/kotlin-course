package org.deloys.three.org.deploys.three.lessons.lesson07.homeworks

import org.deloys.three.org.deploys.three.lessons.lesson03.homework.wifi

fun main() {


//1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    println("Таблица умножения")
    for (i: Int in 1..10) {
        for (j: Int in 1..10) {
            val result: Int = i * j
            print("$result ")
        }
        println()

    }

    println("Функция, которая суммирует числа от 1 до 'arg'")
    addition(10)

    println("Функция, которая вычисляет факториал числа 'arg'")
    factorial(8)

    println("Функция, которая находит сумму всех четных чисел от 2 до 'arg'")
    addition(2)

    println("Stars")
    stars()

    println("Функция, которая используя цикл for находит суммы чётных и нечётных значений чисел от 1 до arg")
    sumOddAndEven(8)
}

//2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun addition(arg: Int) {
    var total: Int = 0
    for (i: Int in 1..arg) {
        total += i
    }
    println(total)
}

//3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun factorial(arg: Int) {
    var i: Int = 1
    var result: Int = 1
    while (i <= arg) {
        result *= i
        i++
    }
    println(result)
}

//4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun additionChet(arg: Int) {
    var i = 2
    var res = 0
    while (i++ < arg) {
        if (i % 2 == 0) res += i
    }
    println(res)
}

//5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun stars(){
    var rows = 0
    var columns = 0
    while (rows++ < 3) {
        while (columns++ < 5) {
            print('*')
        }
        columns = 0
        println()
    }
}
//6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun sumOddAndEven(arg: Int) {
    var sumOdd = 0
    var sumEven = 0
    for (i in 1..arg) {
        if (i % 2 == 0) sumOdd += i
        else sumEven += i
    }
    println("Sum of odd numbers is $sumOdd, sum of even numbers is $sumEven")
}