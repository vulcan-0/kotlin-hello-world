package org.vc121.light.basicsyntax

/**
 * 字段后加 !! 表示不能为空
 * 字段后加 ? 表示可以为空
 * 配合 ?: 表示为空时如何处理
 */
fun main(args: Array<String>) {
    // 类型后面加 ? 表示可为空
    var age: String? = "123"
    println(age)

    // age 为空，则抛出空指针异常
    val ages = age!!.toInt()
    println(ages)

    // age 为空，不做处理，返回 null
    val age1 = age?.toInt()
    println(age1)

    // age 为空，返回 -1
    val age2 = age?.toInt() ?: -1
    println(age2)
}