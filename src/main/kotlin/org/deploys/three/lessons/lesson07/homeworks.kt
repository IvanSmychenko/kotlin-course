package org.deloys.three.org.deploys.three.lessons.lesson07

fun main() {

//Задания для цикла for
//Прямой диапазон
//1.Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }
    print("====================\n")

//2.Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10){
        if (i % 2 == 0)
            println(i)
    }
    print("====================\n")

//Обратный диапазон
//3.Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println(i)
    }
    print("====================\n")

//4.Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    var counter2: Int = 0
    for (i in 10 downTo 1) {
        counter2 = i
        println(counter2 - 2)

    }
    print("====================\n")

//С шагом (step)
//5.Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        println(i)
    }
    print("====================\n")

//6.Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    var counter1: Int = 0
    for (i in 1..20) {
        if (i % 3 == 0)
        println(i)
    }
    print("====================\n")

//Использование до (until)
//7.Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    var size: Int = 38
    for (i in 3 until size) {
        println(i)
    }
    print("====================\n")

//Задания для цикла while
//Цикл while
//8.Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var counter: Int = 1
    while (counter <= 5) {
        println(counter * counter)
        counter++
    }
    print("====================\n")

//9.Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var number = 10
    while (number >= 5) {
        println(number)
        number --
    }
    print("====================\n")

//Цикл do while
//10.Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var num: Int = 5
    do {
        println(num)
        num --
    } while (num >=1)
    print("====================\n")

//11.Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter4: Int = 5
    do {
        println(counter4)
        counter4 ++
    } while (counter4 < 10)
    print("====================\n")

//Задания для прерывания и пропуска итерации
//Использование break
//12.Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    print("====================\n")

//13.Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var numbers: Int = 0
    while (true) {
        if (numbers == 10) break
        numbers ++
        println(numbers)
    }
    print("====================\n")

//Использование continue
//14.В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
//15.Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    // Эту задачу надо доделать
    var num2: Int = 1
    while (num2 <= 10) {
        if (num2 % 3 == 0){
            num2++
            continue
        }
        println(num2)
        num2++
    }
    print("====================\n")
}

