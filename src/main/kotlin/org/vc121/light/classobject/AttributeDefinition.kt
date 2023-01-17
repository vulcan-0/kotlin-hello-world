package org.vc121.light.classobject

import java.util.*

/**
 * 可以用关键字 var 声明为可变的，否则使用只读关键字 val 声明为不可变
 * var allByDefault: Int? // 错误: 需要一个初始化语句，默认实现了 getter 和 setter
 * var initialized = 1 // 类型为 Int，默认实现了 getter 和 setter
 * val simple: Int? // 类型为 Int，默认实现 getter，但必须在构造函数中初始化
 * val inferredType = 1 // 类型为 Int，默认实现 getter
 */
class Person {

    var lastName: String = "zhang"
        get() = field.uppercase(Locale.getDefault()) // 将变量赋值后转换为大写
        set

    var no: Int = 100
        get() = field // 后端变量
        set(value) {
            if (value < 10) { // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1 // 如果传入的值大于等于 10 返回 -1
            }
        }

    var height: Float = 145.4f
        private set

}

/**
 * 属性定义
 */
fun main(args: Array<String>) {
    var person: Person = Person() // Kotlin 中没有 new 关键字

    person.lastName = "wang" // 使用 . 号来引用
    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")

    println("height:${person.height}")
}