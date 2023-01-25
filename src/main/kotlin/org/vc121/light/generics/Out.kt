package org.vc121.light.generics

// 声明处型变
// 定义一个支持协变的类
// 使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型
class Runoob<out A>(val a: A) {

    fun foo(): A {
        return a
    }

}

fun main(args: Array<String>) {
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")
    anyCo = strCo
    println(anyCo.foo()) // 输出：a
}