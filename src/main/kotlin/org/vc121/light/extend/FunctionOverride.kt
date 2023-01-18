package org.vc121.light.extend

/**
 * 用户基类
 **/
open class Person3 {

    open fun study() { // 允许子类重写
        println("我毕业了")
    }

}

/**
 * 子类继承 Person3 类
 **/
class Student3 : Person3() {

    override fun study() { // 重写方法
        println("我在读大学")
    }

}

/**
 * 方法重写
 */
fun main(args: Array<String>) {
    val s = Student3()
    s.study()
}