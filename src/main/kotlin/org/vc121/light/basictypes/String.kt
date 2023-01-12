package org.vc121.light.basictypes

fun main(args: Array<String>) {
    val str = "字符串"
    for (c in str) {
        println(c)
    }

    // Kotlin 支持三个引号 """ 括起来的字符串，支持多行字符串
    val text = """|
    多行字符串
    多行字符串
    |"""
    println(text) // 输出有一些前置空格

    // String 可以通过 trimMargin() 方法来删除多余的空白
    // 默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")
    val text2 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text2) // 前置空格删除了
}