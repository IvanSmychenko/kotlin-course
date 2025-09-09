package org.deloys.three.org.deploys.three.lessons.lesson03


const val wheels = 4

class  Auto {

    val vincode: String = "VAR875454998"
    var color: String = "black"
    var mileage: Int = 0
    lateinit var ownername: String

    val utilreport: String by lazy {
        "sample text"
    }
}
