package org.vc121.light.generics

// 声明处型变
// 定义一个支持逆变的类
// in 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型
class Runoob2<in A>(a: A) {

    fun foo(a: A) {
        println(a)
    }

}

fun main(args: Array<String>) {
    var strCo: Runoob2<String> = Runoob2("a")
    var anyCo: Runoob2<Any> = Runoob2<Any>("b")

    strCo.foo("c") // 输出：c
}