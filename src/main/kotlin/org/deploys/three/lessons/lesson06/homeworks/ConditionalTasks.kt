package org.deloys.three.org.deploys.three.lessons.lesson06.homeworks

fun main() {

    season(5)
    ageCalculation(5)
    methodMovement(5.1)
    bonusPoints(600.0)
    documentType("doc")
    tempConvert(32, 'C')
    selectClothes(30)
    choosMovies(12)
}

//Задание 1: "Определение сезона"
//Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.

fun season(month: Byte) {
    when (month) {
        in setOf<Byte>(12, 1, 2) -> println("Winter")
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Autumn")
        else -> println("Month number incorrect!")
    }
}

//Задание 2: "Расчет возраста питомца"
//Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5
// человеческим годам, после - каждый год равен 4 человеческим годам. Результат распечатай в консоль.

const val FIRST_TWO_YEARS_DOG = 2
const val FIRST_TWO_YEARS_CONVERSION_HUMAN = 10.5
fun ageCalculation(age: Int) {
    if (age in 1..2) {
        val dogAge = age * FIRST_TWO_YEARS_CONVERSION_HUMAN
        println("Age of the dog $dogAge")
    } else if (age > FIRST_TWO_YEARS_DOG) {
        val delaysAge = age - FIRST_TWO_YEARS_DOG
        val dogAge = (FIRST_TWO_YEARS_DOG * FIRST_TWO_YEARS_CONVERSION_HUMAN) + (delaysAge * 4)
        println("Age of the dog $dogAge")
    } else {
        println("The age of uncorrected!")
    }
}


//Задание 3: "Определение способа перемещения"
//Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun methodMovement(distance: Double) {
    when (distance) {
        in 0.0..1.0 -> println("пешком")
        in 1.1..5.0 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

//Задание 4: "Расчет бонусных баллов"
//Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и
// печатает в консоль количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и
// 3 балла за каждые 100 рублей при сумме свыше этого.

fun bonusPoints(amount: Double) {
    if (amount in 100.0..1000.0) {
        val bonus = (amount / 100) * 2
        println("Your bonuses $bonus")
    } else if (amount > 1000.0) {
        val bonus = (amount / 100) * 3
        println("Your bonuses $bonus")
    } else {
        println("There are no bonuses.")
    }
}

//Задание 5: "Определение типа документа"
//В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла
// печатает в консоль его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun documentType(type: String) {
    when (type) {
        in setOf<String>("pdf", "doc", "docx", "txt") -> println("Текстовый документ")
        in setOf<String>("jpeg", "jpg", "png", "gif") -> println("Изображение")
        in setOf<String>("xls", "xlsx", "csv", "ods") -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

//Задание 6: "Конвертация температуры"
//Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от
// указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
// Несколько аргументов передаются через запятую. Распечатай в консоль результат конвертации с добавлением единицы
// измерения. Чтобы добавить единицу измерения после результата используй функцию печати без переноса
// строки print("C") или print("F").

fun tempConvert(valueTemp: Int, tempUnits: Char) {
    if (tempUnits == 'C') {
        val tempF = valueTemp * 9 / 5 + 32
        println("$valueTemp $tempUnits = $tempF F")
    } else if (tempUnits == 'F') {
        val tempC = (valueTemp - 32) * 5 / 9
        println("$valueTemp $tempUnits = $tempC C")
    } else {
        println("Data entered incorrectly.")
    }
}

//Задание 7: "Подбор одежды по погоде"
//Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре
// ниже +10, "ветровка" от +10 до +18 градусов включительно и "футболка и шорты" при температуре выше +18 градусов.
// При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun selectClothes(temp: Int) {
    if (temp < -30 || temp > 30) {
        println("не выходить из дома")
    } else if (temp < 10) {
        println("куртка и шапка")
    } else if (temp <= 18) {
        println("ветровка")
    } else {
        println("футболка и шорты")
    }
}

//Задание 8: "Выбор фильма по возрасту"
//Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и
// возвращает доступные для него категории фильмов: "детские" (от 0 до 9), "подростковые" (от 10 до 18), "18+"
// для остальных.

fun choosMovies(age: Int) {
    when (age) {
        in 0..9 -> println("детские")
        in 10..18 -> println("подростковые")
        else -> println("для остальных")
    }
}