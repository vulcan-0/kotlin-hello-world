package org.vc121.light.interfaces

interface MyInterface2 {

    var name: String // name 属性，抽象的

    fun bar()

    fun foo() {
        // 可选的方法体
        println("foo")
    }

}

class Child2 : MyInterface2 {

    override var name: String = "runoob" // 重写属性

    override fun bar() {
        // 方法体
        println("bar")
    }

}

fun main(args: Array<String>) {
    val c = Child2()
    c.foo()
    c.bar()
    println(c.name)
}