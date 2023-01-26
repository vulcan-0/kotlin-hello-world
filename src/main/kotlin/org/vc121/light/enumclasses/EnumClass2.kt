package org.vc121.light.enumclasses

enum class RGB {

    RED, GREEN, BLUE

}

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
    println()
}

fun main(args: Array<String>) {
    printAllValues<RGB>() // 输出：RED, GREEN, BLUE
    println(enumValueOf<RGB>("RED")) // 输出：RED
}