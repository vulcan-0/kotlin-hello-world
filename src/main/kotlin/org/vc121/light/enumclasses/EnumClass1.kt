package org.vc121.light.enumclasses

enum class Color {

    RED, BALCK, BLUE, GREEN, WHITE

}

fun main(args: Array<String>) {
    var color: Color = Color.BLUE

    println(Color.values())
    println(Color.valueOf("RED"))
    println(color.name)
    println(color.ordinal)
}