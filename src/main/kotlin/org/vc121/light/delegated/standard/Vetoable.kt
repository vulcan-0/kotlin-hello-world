package org.vc121.light.delegated.standard

import kotlin.properties.Delegates

var vetoableProp: Int by Delegates.vetoable(0) { _, oldValue, newValue ->
    // 如果新的值大于旧值，则生效
    newValue > oldValue
}

fun main(args: Array<String>) {
    println("vetoableProp=$vetoableProp")
    vetoableProp = 10
    println("vetoableProp=$vetoableProp")
    vetoableProp = 5
    println("vetoableProp=$vetoableProp")
    vetoableProp = 100
    println("vetoableProp=$vetoableProp")
}