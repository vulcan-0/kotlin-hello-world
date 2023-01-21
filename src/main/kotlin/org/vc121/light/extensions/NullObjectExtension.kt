package org.vc121.light.extensions

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this” 会自动转换为非空类型，所以下面的 toString() 解析为 Any 类的成员函数
    return toString()
}

fun main(args: Array<String>) {
    var t = null
    println(t.toString())
}