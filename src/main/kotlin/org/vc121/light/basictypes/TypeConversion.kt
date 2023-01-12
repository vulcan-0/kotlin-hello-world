package org.vc121.light.basictypes

fun main(args: Array<String>) {
    val b: Byte = 127 // OK，字面值是静态检测的
    // val i: Int = b // 错误
    val i: Int = b.toInt() // OK
    val l: Long = 1L + 3 // Long + Int => Long
    val l2: Long = 1L + b // Long + Byte => Long

    println(b)
    println(i)
    println(l)
    println(l2)
}