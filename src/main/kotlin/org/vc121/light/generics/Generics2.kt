package org.vc121.light.generics

import java.util.*

fun <T> doPrintln(content: T) {
    when (content) {
        is Int -> println("整型数字为：$content")
        is String -> println("字符串转换为大写：${content.uppercase(Locale.getDefault())}")
        else -> println("T 不是整型，也不是字符串")
    }
}

fun main(args: Array<String>) {
    val age = 23
    val name = "Runoob"
    val bool = true

    doPrintln(age) // 整型
    doPrintln(name) // 字符串
    doPrintln(bool) // 布尔型
}