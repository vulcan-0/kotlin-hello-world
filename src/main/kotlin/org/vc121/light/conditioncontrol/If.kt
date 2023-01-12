package org.vc121.light.conditioncontrol

fun main(args: Array<String>) {
    val a = 1
    val b = 2

    // 传统用法
    var max = a
    if (a < b) max = b
    println("max value is $max")

    // 使用 else
    var max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    println("max2 value is $max2")

    // 可以把 if 表达式的结果赋值给一个变量
    val max3 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("max3 value is $max3")

    // 替代 Java 的三元操作符
    val max4 = if (a > b) a else b
    println("max4 value is $max4")

    // 使用区间
    val x = 5
    if (x in 1..8) {
        println("x 在区间内")
    }
}