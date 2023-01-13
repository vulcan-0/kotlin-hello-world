package org.vc121.light.classobject

class Runoob2 constructor(name: String) { // 类名为 Runoob

    // 大括号内是类体构成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var sitename = name

    init {
        println("初始化网站名: ${name}")
    }

    // 次构造函数
    constructor(name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是类的函数")
    }

}

fun main(args: Array<String>) {
    val runoob = Runoob2("菜鸟教程", 10000)
    println(runoob.sitename)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}