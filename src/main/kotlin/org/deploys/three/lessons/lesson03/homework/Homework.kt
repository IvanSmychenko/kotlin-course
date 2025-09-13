package org.deloys.three.org.deploys.three.lessons.lesson03.homework


// 1. Название мероприятия (неизменяемая публичная переменная известная на момент написания)
val name: String = "Monster Hackaton"

// 2. Дата проведения (публичная переменная известная на момент написания, но может быть изменена из-за переноса)
var date: String = "25 october 1917"

// 3. Место проведения (публичная переменная известная на момент написания, но может быть изменена из-за переноса)
var placeEvent: String = "Petrograd"

// 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
// (приватная неизменяемая переменная - её не должны увидеть и бюджет уже запланирован и утверждён и не должен изменяться)
private val detaileBudget: String = "Detail info about event budget"

// 5. Количество участников (публичная переменная, известная на момент написания, но может быть изменена)
var participantsCount: Int = 0

// 6. Длительность хакатона (публичная, известна на момент написания, может измениться)
var hackathonDuration: Int = 8

// 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private val suppliersContacts: String = "This is a contract"

// 8. Текущее состояние хакатона (статус)
var status: String = "No started"

// 9. Список спонсоров
val sponsors: String = "1XBet"

// 10. Бюджет мероприятия
private val budget: Int = 100500

// 11. Текущий уровень доступа к интернету
var wifi: Boolean = false

// 12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var logisticsInfo: String = "Internal communication"

// 13. Количество команд
var numberTeams: Int = 0

// 14. Перечень задач
val tasksList: String = "All tasks"

// 15. План эвакуации
var evacuationPlan: String = "Alarm plan"
    private set
// 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
val allEnviromentList: String = "two paks grass"

// 17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
lateinit var freeEnviromentList: String

// 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала) (публичная изменяемая переменная с отложенной инициализацией, так как на момент создания поставщик и график не известны)
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев
private val sparePlan: String by lazy {
    "Plan B"
}

// 20. Список экспертов и жюри
var expertsAndJury: String = "Woman-cat, Matthew, Houston, Jeanne"
    private set
// 21. Политика конфиденциальности
val privacyPolicy: String = "Privat Policy"

// 22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private lateinit var userFeedback: String

// 23. Текущая температура в помещении
lateinit var currentTemperature: String

// 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей
// отладки своих приложений командами
private var monitoringData: String = "speed tests"

// 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
private val internetSpeedRegulator: Double = 0.5

// 26. Уровень освещения
private var lightLevel: Int = 4

// 27. Лог событий мероприятия
private lateinit var eventLog: String

// 28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
val medicineHelp: Boolean = true

// 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
private val securityProtocols: String by lazy { "Safety of the event." }

// 30. Регистрационный номер мероприятия
val registrationNumber: String = "R12345WE12"

// 31. Максимально допустимый уровень шума в помещении хакатона.
const val VOLUME_LEVEL: Int = 520

// 32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
private var indexVolumeLevel: Boolean = false

// 33. План взаимодействия с прессой
val reportersPlan: String = "План взаимодействия с прессой"

// 34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор
// статистики прогона автоматизированных проверок.
lateinit var infoByProject: String

// 35. Статус получения всех необходимых разрешений для проведения мероприятия
private var permissionStatus: Boolean = false

// 36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
private var indexEnvironmentAccessibility: Boolean = false

// 37. Список партнеров мероприятия
val parners: String = "Partners list"

// 38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
val reportEvent: String by lazy { "Media" }

// 39. Внутренние правила распределения призов
private val internalRules: String = "All prizes are only"

// 40. Список разыгрываемых призов
val prizeList: String = "Gifts"

// 41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
private val emergencyContacts: String = "emergency contacts"

// 42. Особые условия для участников с ограниченными возможностями
val specialConditions: Boolean = true

// 43. Общее настроение участников (определяется опросами)
lateinit var moodParticipants: String

// 44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
lateinit var hackatonDetailPlan: String

// 45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
val haedliner: String by lazy { "haedliner" }

// 46. Максимальное количество людей, которое может вместить место проведения.
const val MAX_PEOPLE_COUNT = 1500

// 47. Количество часов, отведенное каждой команде для работы над проектом.
val timeLimit: Int = 6