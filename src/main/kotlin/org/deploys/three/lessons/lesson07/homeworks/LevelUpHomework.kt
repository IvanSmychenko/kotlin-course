package org.deloys.three.org.deploys.three.lessons.lesson07.homeworks

fun main() {


//1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    println("Таблица умножения")
    for (i: Int in 1..10){
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


//5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
//6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
}

//2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun addition(arg: Int){
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
    var i: Int = 2
    var res: Int = 0
    while (i <= arg && i % 2 == 0 && arg % 2 == 0) {
        res += i
        i ++
    }
    println(res)
}