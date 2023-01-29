package org.vc121.light.delegated

// 创建接口
interface Base {

    fun print()

}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {

    override fun print() {
        print(x)
    }

}

// 通过关键字 by 建立委托类
class Drived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Drived(b).print() // 输出：10
}