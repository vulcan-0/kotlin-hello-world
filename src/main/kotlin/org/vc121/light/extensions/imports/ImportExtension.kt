package org.vc121.light.extensions.imports

import org.vc121.light.extensions.Baz

/**
 * 导入扩展函数
 */
import org.vc121.light.extensions.goo // 导入所有名为 goo 的扩展
import org.vc121.light.extensions.* // 或者，从 foo.bar 导入一切

fun useage(baz: Baz) {
    baz.goo()
}

fun main(args: Array<String>) {
    val baz = Baz()
    useage(baz)
}