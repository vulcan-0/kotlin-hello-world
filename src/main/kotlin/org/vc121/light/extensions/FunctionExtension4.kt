package org.vc121.light.extensions

class E {

    fun foo() {
        println("成员函数")
    }

}

fun E.foo() {
    println("扩展函数")
}

// 若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数
fun main(args: Array<String>) {
    var e = E()
    e.foo() // 输出：成员函数
}