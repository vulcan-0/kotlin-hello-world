package org.vc121.light.basicsyntax

private fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

private fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // 直接使用 `x * y` 会导致错误，因为它们可能为 null
    if (x != null && y != null) {
        // 在进行过 null 值检查之后，x 和 y 的类型会被自动转换为非 null 变量
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}