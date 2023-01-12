package org.vc121.light.basictypes

// Kotlin 中的 Char 不能直接和数字操作，Char 必需是单引号 ' 包含起来的
fun check(c: Char) {
    // if (c == 1) { // 错误：类型不兼容
    //
    // }
}

// 把字符转换为 Int 数字
fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.code - '0'.code // 显式转换为数字
}

fun main(args: Array<String>) {
    val i = decimalDigitValue('1')
    println(i)
}