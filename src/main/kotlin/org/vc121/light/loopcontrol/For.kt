package org.vc121.light.loopcontrol

fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    println("------------------\nitems: ")
    for (item in items) {
        println(item)
    }

    println("------------------\nitems: ")
    for (item: String in items) {
        println(item)
    }

    println("------------------\nitems: ")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println("------------------\nitems: ")
    for ((index, value) in items.withIndex()) {
        println("item at $index is $value")
    }
}