package org.vc121.light.classobject

/**
 * abstract    // 抽象类
 * final       // 类不可继承，默认属性
 * enum        // 枚举类
 * open        // 类可继承，类默认是 final 的
 * annotation  // 注解类
 *
 * 默认可见性是 public
 * private    // 仅在同一个文件中可见
 * protected  // 同一个文件中或子类可见
 * public     // 所有调用的地方都可见
 * internal   // 同一个模块中可见
 */
class Test {

    var v = "成员属性"

    fun setInterface(test: TestInterface) {
        test.test()
    }

}

/**
 * 定义接口
 */
interface TestInterface {

    fun test()

}

fun main(args: Array<String>) {
    var test = Test()

    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例
     */
    test.setInterface(object : TestInterface {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })
}