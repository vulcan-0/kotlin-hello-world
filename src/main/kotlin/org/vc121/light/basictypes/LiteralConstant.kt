package org.vc121.light.basictypes

/**
 * 十进制：123
 * 长整型以大写的 L 结尾：123L
 * 16 进制以 0x 开头：0x0F
 * 2 进制以 0b 开头：0b00001011
 * 注意：8进制不支持
 *
 * Doubles 默认写法：123.5，123.5e10
 * Floats 使用 f 或者 F 后缀：123.5f
 */
fun main(args: Array<String>) {
    // 可以使用下划线使数字常量更易读
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)
}