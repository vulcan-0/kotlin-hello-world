package org.vc121.light.basicsyntax

/**
 * 可变变量定义：var 关键字
 * 不可变变量定义：val 关键字，只能赋值一次的变量（类似 Java 中 final 修饰的变量）
 */
fun main(args: Array<String>) {
    val a: Int = 1
    val b = 1 // 系统自动推断变量类型为 Int
    val c: Int // 如果不在声明时初始化则必须提供变量类型
    c = 1 // 明确赋值

    var x = 5 // 系统自动推断变量类型为 Int
    x += 1 // 变量可修改

    // 输出 1
    println(a)
    // 输出 1
    println(b)
    // 输出 1
    println(c)
    // 输出 6
    println(x)
}