package org.vc121.light.extensions

// 扩展属性允许定义在类或者 kotlin 文件中，不允许定义在函数中
// 初始化属性因为属性没有后端字段（backing field），所以不允许被初始化，只能由显式提供的 getter/setter 定义
val <T> List<T>.lastIndex: Int
    get() = size - 1

// val <T> List<T>.bar = 1 // 错误：扩展属性不能有初始化器

fun main(args: Array<String>) {
    var l = listOf(1, 3, 5)
    println(l.lastIndex)
}