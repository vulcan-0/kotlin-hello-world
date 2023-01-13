package org.vc121.light.loopcontrol

fun main(args: Array<String>) {
    // ----------- continue and break -----------
    for (i in 1..10) {
        if (i == 3) continue // i 为 3 时，跳过当前循环，继续下一次循环
        println(i)
        if (i > 5) break // i 为 6 时，跳出循环
    }

    // 使用标签
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 3) continue@loop
            if (i == 5) break@loop
            print("[$i, $j]")
        }
        println()
    }

    // ----------- return -----------
    foo()
    foo2()
    foo3()
    foo4()

    // return@a 1，疑问：哪种场景下需要这样返回？
}

// 直接返回
fun foo() {
    println("foo begin ======")
    val ints = intArrayOf(1, 2, -3, 0, 4, 6)
    ints.forEach {
        if (it == 0) return
        println(it)
    }
    println("foo end ======")
}

// 使用标签
fun foo2() {
    println("foo2 begin ======")
    val ints = intArrayOf(1, 2, -3, 0, 4, 6)
    ints.forEach lit@{
        if (it == 0) return@lit
        println(it)
    }
    println("foo2 end ======")
}

// 使用隐式标签
fun foo3() {
    println("foo3 begin ======")
    val ints = intArrayOf(1, 2, -3, 0, 4, 6)
    ints.forEach {
        if (it == 0) return@forEach
        println(it)
    }
    println("foo3 end ======")
}

// 使用匿名函数
fun foo4() {
    println("foo4 begin ======")
    val ints = intArrayOf(1, 2, -3, 0, 4, 6)
    ints.forEach(fun(value: Int) {
        if (value == 0) return
        println(value)
    })
    println("foo4 end ======")
}