package org.vc121.light.delegated.standard

import kotlin.properties.Delegates

class Foo {

    var notNullBar: String by Delegates.notNull<String>()

}

fun main(args: Array<String>) {
    val foo = Foo()
    // println(foo.notNullBar) // 属性在赋值前就被访问的话则会抛出异常
    foo.notNullBar = "bar"
    println(foo.notNullBar)
}