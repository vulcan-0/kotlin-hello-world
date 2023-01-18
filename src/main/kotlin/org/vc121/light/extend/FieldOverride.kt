package org.vc121.light.extend

open class Foo {

    open val x: Int = 1

}

class Bar : Foo() {

    override val x: Int = 2

}

/**
 * 属性重写
 */
fun main(args: Array<String>) {
    var b = Bar()
    println(b.x)
}