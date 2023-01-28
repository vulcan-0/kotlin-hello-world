package org.vc121.light.objectdeclarations

/**
 * Kotlin 使用 object 关键字来声明一个对象
 * Kotlin 中我们可以方便的通过对象声明来获得一个单例
 */
object Site {

    var url: String = ""
    val name: String = "菜鸟教程"

}

fun main(args: Array<String>) {
    var s1 = Site
    var s2 = Site
    s1.url = "www.runoob.com"
    println(s1.url)
    println(s2.url)
}