package org.vc121.light.delegated

import kotlin.reflect.KProperty

class Delegated<T>(t: T) {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef，这里委托了 ${property.name} 属性"
    }

}

class ResourceLoader<T>() {

    operator fun provideDelegate(thisRef: Any, prop: KProperty<*>): Delegated<T?> {
        checkProperty(thisRef, prop.name)
        // 创建委托
        var t: T? = null
        return Delegated(t)
    }

    fun checkProperty(thisRef: Any, name: String) {
        println("$thisRef，$name")
    }

}

fun <T> bindResource(): ResourceLoader<T> {
    return ResourceLoader()
}

class MyUI {

    val image by bindResource<String>()
    val text by bindResource<String>()

}

fun main(args: Array<String>) {
    val myui: MyUI = MyUI()
    println(myui.image)
    println(myui.text)
}