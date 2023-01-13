package org.vc121.light.classobject

class Runoob constructor(name: String) { // 类名为 Runoob

    // 大括号内是类体构成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var sitename = name

    init {
        println("初始化网站名: ${name}")
    }

    fun printTest() {
        println("我是类的函数")
    }

}

fun main(args: Array<String>) {
    val runoob = Runoob("菜鸟教程")
    println(runoob.sitename)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}