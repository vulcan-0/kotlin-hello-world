package org.vc121.light.objectdeclarations

/**
 * 类内部的对象声明可以用 companion 关键字标记，
 * 这样它就与外部类关联在一起，
 * 我们就可以直接通过外部类访问到对象的内部元素
 */
class MyClass {

    companion object Factory {

        fun create(): MyClass = MyClass()

    }

}

/**
 * 我们可以省略掉该对象的对象名，
 * 然后使用 Companion 替代需要声明的对象名
 */
class MyClass2 {

    companion object {
    }

}

interface Factory<T> {

    fun create(): T

}

/**
 * 伴生对象实现接口
 */
class MyClass3 {

    companion object : Factory<MyClass3> {

        override fun create(): MyClass3 = MyClass3()

    }

}

fun main(args: Array<String>) {
    val instance = MyClass.create() // 访问到对象的内部元素
    println(instance)

    val x = MyClass2.Companion
    println(x)

    val y = MyClass3.create()
    println(y)
}