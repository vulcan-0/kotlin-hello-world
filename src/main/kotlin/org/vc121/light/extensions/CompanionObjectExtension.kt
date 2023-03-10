package org.vc121.light.extensions

class MyClass {

    /**
     * 伴生对象/伴随对象
     */
    companion object {} // 将被称为 "Companion"

}

fun MyClass.Companion.foo() {
    println("伴随对象的扩展函数")
}

val MyClass.Companion.no: Int
    get() = 10

fun main(args: Array<String>) {
    println("no: ${MyClass.no}")
    MyClass.foo()
}