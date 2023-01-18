package org.vc121.light.extend

open class A {

    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }

}

interface B {

    fun f() { // 接口的方法默认是 open 的
        print("B")
    }

    fun b() {
        print("b")
    }

}

class C() : A(), B {

    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }

}

fun main(args: Array<String>) {
    val c = C()
    c.f()
}