package org.vc121.light.delegated.standard

val lazyValue: String by lazy {
    println("computed!") // 第一次调用输出，第二次调用不输出
    "hello"
}

fun main(args: Array<String>) {
    println(lazyValue)   // 第一次执行，执行两次输出表达式
    println(lazyValue)   // 第二次执行，只输出返回值
}