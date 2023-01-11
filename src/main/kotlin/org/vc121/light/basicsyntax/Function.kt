package org.vc121.light.basicsyntax

// 函数定义使用关键字 fun，参数格式为：参数: 类型
fun sum(a: Int, b: Int): Int { // Int 参数，返回值 Int
    return a + b
}

// 表达式作为函数体，返回类型自动推断
fun sum2(a: Int, b: Int) = a + b

// public 方法则必须明确写出返回类型
public fun sum3(a: Int, b: Int): Int = a + b

// 无返回值的函数（类似 Java 中的 void）
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

// 如果是返回 Unit 类型，则可以省略（对于 public 方法也是这样）
public fun printSum2(a: Int, b: Int) {
    print(a + b)
}

// 函数的变长参数可以用 vararg 关键字进行标识
fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}

// lambda（匿名函数）
val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

fun main(args: Array<String>) {
    // 输出 3
    println(sum(1, 2))
    // 输出 3
    println(sum2(1, 2))
    // 输出 3
    println(sum3(1, 2))

    // 输出 3
    printSum(1, 2)
    println()
    // 输出 3
    printSum2(1, 2)
    println()

    // 输出 12345
    vars(1, 2, 3, 4, 5)
    println()

    // 输出 3
    println(sumLambda(1, 2))
}