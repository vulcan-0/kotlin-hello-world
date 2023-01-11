package org.vc121.light.basicsyntax

/**
 * $varName 表示变量值
 * ${varName.fun()} 表示变量的方法返回值
 */
fun main(args: Array<String>) {
    var a = 1
    // 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)
}