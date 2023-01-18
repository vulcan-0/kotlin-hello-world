package org.vc121.light.extend

interface Foo2 {

    val count: Int

}

class Bar2 : Foo2 {

    override val count: Int = 0

}

/**
 * 属性重写
 */
fun main(args: Array<String>) {
    var b = Bar2()
    println(b.count)
}