package org.vc121.light.datasealedclasses

/**
 * 编译器会自动的从主构造函数中根据所有声明的属性提取以下函数：
 * equals() / hashCode()
 * toString() 格式如："User(name=John, age=42)"
 * componentN() functions 对应于属性，按声明顺序排列
 * copy() 函数
 *
 * 数据类需要满足以下条件：
 * 主构造函数至少包含一个参数；
 * 所有的主构造函数的参数必须标识为 val 或者 var；
 * 数据类不可以声明为 abstract, open, sealed 或者 inner；
 * 数据类不能继承其他类 (但是可以实现接口)。
 */
data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User(name = "Jack", age = 1)
    val oldJack = jack.copy(age = 2)
    println(jack)
    println(oldJack)

    val jane = User("Jane", 35)
    val (name, age) = jane // 解构声明
    println("$name, $age years of age") // 输出： Jane, 35 years of age
}