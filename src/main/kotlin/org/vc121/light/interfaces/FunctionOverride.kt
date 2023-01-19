package org.vc121.light.interfaces

interface A {

    fun foo() { // 已实现
        print("A")
    }

    fun bar() // 未实现，没有方法体，是抽象的

}

interface B {

    fun foo() { // 已实现
        print("B")
    }

    fun bar() { // 已实现
        print("bar")
    }

}

class C : A {

    override fun bar() { // 重写
        print("bar")
    }

}

class D : A, B {

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }

}

fun main(args: Array<String>) {
    var d = D()
    d.foo()
    d.bar()
}