package org.vc121.light.extensions

class D3 {

    fun bar() {
        println("D3 bar")
    }

}

class C3 {

    fun bar() {
        println("C3 baz") // 与 D3 类的 bar 同名
    }

    fun D3.foo() {
        bar() // 调用 D3.bar，扩展接收者优先
        this@C3.bar() // 调用 C3.baz
    }

    fun caller(d: D3) {
        d.foo()  // 调用扩展函数
    }

}

fun main(args: Array<String>) {
    // 分发接受者
    val c: C3 = C3()
    // 扩展接受者
    val d: D3 = D3()
    c.caller(d)
}