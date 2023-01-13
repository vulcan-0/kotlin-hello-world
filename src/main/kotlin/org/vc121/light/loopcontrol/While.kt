package org.vc121.light.loopcontrol

fun main(args: Array<String>) {
    println("---- while 使用 -----")
    var x = 5
    while (x > 0) {
        println(x--)
    }

    println("---- do-while 使用 -----")
    var y = 5
    do {
        println(y--)
    } while (y > 0)
}