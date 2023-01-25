package org.vc121.light.generics

class A<T>(val t: T, val t2: T, val t3: T)

class Apple(var name: String)

fun main(args: Array<String>) {
    // 使用类
    val a1: A<*> = A(12, "String", Apple("苹果"))
    val a2: A<Any?> = A(12, "String", Apple("苹果")) // 和 a1 是一样的
    val apple = a1.t3 // 参数类型为 Any
    println(apple)
    val apple2 = apple as Apple // 强转成 Apple 类
    println(apple2.name)
    // 使用数组
    val l: ArrayList<*> = arrayListOf("String", 1, 1.2f, Apple("苹果"))
    for (item in l) {
        println(item)
    }
}