package org.vc121.light.generics

class Box<T>(t: T) {

    var value = t

}

fun main(args: Array<String>) {
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("Runoob")

    println(boxInt.value)
    println(boxString.value)
}