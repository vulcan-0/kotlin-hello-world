package org.vc121.light.basictypes

fun main(args: Array<String>) {
    val i = 10
    val s = "i == $i" // 求值结果为 "i = 10"
    println(s)

    val s2 = "runoob"
    val str = "$s2.length is ${s2.length}" // 求值结果为 "runoob.length is 6"
    println(str)

    val price = """
    ${'$'}9.99
    """ // 求值结果为 $9.99
    println(price)

    val price2 = "$9.99"
    println(price2)
}