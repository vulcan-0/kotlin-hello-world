package org.vc121.light.objectdeclarations

open class A(x: Int) {

    public open val y: Int = x

}

interface B {}

// 对象表达式
val ab: A = object : A(1), B {

    override val y = 15

}

fun main(args: Array<String>) {
    println(ab.y)

    // 通过对象表达式可以越过类的定义直接得到一个对象
    val site = object {
        var name: String = "菜鸟教程"
        var url: String = "www.runoob.com"
    }
    println(site.name)
    println(site.url)
}