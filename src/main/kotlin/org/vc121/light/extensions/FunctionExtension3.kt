package org.vc121.light.extensions

open class C

class D : C()

fun C.foo() = "c" // 扩展函数 foo

fun D.foo() = "d" // 扩展函数 foo

fun printFoo(c: C) {
    // 在调用扩展函数时，具体被调用的的是哪一个函数，由调用函数的的对象表达式来决定的，而不是动态的类型决定的
    println(c.foo()) // 类型是 C 类
}

fun main(args: Array<String>) {
    printFoo(D()) // 输出：c
}