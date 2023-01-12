package org.vc121.light.conditioncontrol

fun main(args: Array<String>) {
    var x = 5

    // when 类似 Java 的 switch 操作符
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x 不是 1，也不是 2")
        }
    }

    // 把多个分支条件放在一起，用逗号分隔
    when (x) {
        1, 2 -> println("x == 1 or x == 2")
        else -> println("otherwise")
    }

    // 使用 in 和 !in
    val validNumbers = intArrayOf(33, 34, 35)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    // 作为函数
    fun hasPrefix(x: Any) = when (x) {
        is String -> x.startsWith("prefix") // x 自动转为 String
        else -> false
    }

    val str = "prefix:aaa"
    println("$str has prefix: ${hasPrefix(str)}")

    // 使用 when 取代 if-else 链
    when {
        x.isOdd() -> println("x is odd") // 奇数
        x.isEven() -> println("x is even") // 偶数
        else -> print("x is funny")
    }
}

// 是否是奇数
fun Int.isOdd(): Boolean {
    return this % 2 != 0
}

// 是否是偶数
fun Int.isEven(): Boolean {
    return this % 2 == 0
}