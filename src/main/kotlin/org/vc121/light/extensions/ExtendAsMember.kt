package org.vc121.light.extensions

class D2 {

    fun bar() {
        println("D2 bar")
    }

}

class C2 {

    fun baz() {
        println("C2 baz")
    }

    fun D2.foo() {
        bar() // 调用 D2.bar
        baz() // 调用 C2.baz
    }

    fun caller(d: D2) {
        d.foo()  // 调用扩展函数
    }

}

fun main(args: Array<String>) {
    // 分发接受者
    val c: C2 = C2()
    // 扩展接受者
    val d: D2 = D2()
    c.caller(d)
}