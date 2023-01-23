package org.vc121.light.extensions

open class D4 {
}

class D5 : D4() {
}

open class C4 {

    open fun D4.foo() {
        println("D4.foo in C4")
    }

    open fun D5.foo() {
        println("D5.foo in C4")
    }

    fun caller(d: D4) {
        d.foo() // 调用扩展函数
    }

}

class C5 : C4() {

    override fun D4.foo() {
        println("D4.foo in C5")
    }

    override fun D5.foo() {
        println("D5.foo in C5")
    }

}

fun main(args: Array<String>) {
    C4().caller(D4()) // 输出 "D4.foo in C4"
    C5().caller(D4()) // 输出 "D4.foo in C5" —— 分发接收者虚拟解析
    C4().caller(D5()) // 输出 "D4.foo in C4" —— 扩展接收者静态解析
}