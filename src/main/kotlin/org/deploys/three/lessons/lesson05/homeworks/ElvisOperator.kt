package org.deloys.three.org.deploys.three.lessons.lesson05.homeworks

fun main () {
// Задача 1
// Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной
// интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестным.
// Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания
// пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
// Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.

    val initSoundIntensive: Double = 58.0
    val soundAttenuationCaf: Double? = 0.11
    val defaultAttenuationCaf: Double = 0.5
    val soundIntensiveAfterAttenuation = initSoundIntensive * (soundAttenuationCaf ?: defaultAttenuationCaf)
    println(soundIntensiveAfterAttenuation)


// Задача 2
// Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
// которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
// Задача: Рассчитать полную стоимость доставки.

    val defaultCost: Double = 50.0
    val generalCost: Double? = 40.0
    val deliveryCost = 5.0
    val cargoInsurance: Double = 0.005
    val cargoInsuranceCost = (generalCost ?: defaultCost) * cargoInsurance
    val fullPrice: Double = cargoInsuranceCost + defaultCost
    println(fullPrice)


// Задача 3
// Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
// которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

    val atmosphericPressure: String? = "756.0"
    val lostPressureMetric: String = "Lost the pressure metric!"
    val pressureInLab = atmosphericPressure ?: lostPressureMetric
    println(pressureInLab)
}