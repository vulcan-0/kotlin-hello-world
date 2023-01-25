package org.vc121.light.generics

/**
 * 泛型约束
 * 对泛型的类型上限进行约束
 */
fun <T : Comparable<T>> sort(list: List<T>) {
    // ......
}

fun main(args: Array<String>) {
    sort(listOf(1, 2, 3)) // OK，Int 是 Comparable<Int> 的子类型
    var list = listOf(HashMap<Int, String>())
    // sort(list) // 错误：HashMap<Int, String> 不是 Comparable<HashMap<Int, String>> 的子类型
}