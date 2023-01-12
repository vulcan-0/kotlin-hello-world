package org.vc121.light.basictypes

/**
 * toString(2) 展示的是[原码]，二进制数字运算使用的是[补码]
 * 正数：原码 = 反码 = 补码
 * 负数：反码 = 原码符号位 + 原码其他位反转，补码 = 反码 + 1
 * 例如：
 * [+1] = [00000001]原 = [00000001]反 = [00000001]补
 * [-1] = [10000001]原 = [11111110]反 = [11111111]补
 * 1 字节的数字中，0 和 -128 是特殊的，它们的编码是：
 * [0] = [00000000]原 = [00000000]反 = [00000000]补
 * [-128] = [10000000]原 = [10000000]反 = [10000000]补
 */
fun main(args: Array<String>) {
    // 补码：11111111_11111111_11111111_11111111
    // 反码：11111111_11111111_11111111_11111110（补码 -1）
    // 原码：10000000_00000000_00000000_00000001
    val bits: Int = -1

    // 补码：11111111_11111111_11111111_11111111（原数据）
    // 补码：11111111_11111111_11111111_11111110（左移后）
    // 反码：11111111_11111111_11111111_11111101（补码 -1）
    // 原码：10000000_00000000_00000000_00000010
    val shlBits = bits.shl(1) // 左移位（Java’s <<）

    // 补码：11111111_11111111_11111111_11111111（原数据）
    // 补码：11111111_11111111_11111111_11111111（右移后）
    // 反码：11111111_11111111_11111111_11111110（补码 -1）
    // 原码：10000000_00000000_00000000_00000001
    val shrBits = bits.shr(1) // 右移位（Java’s >>）

    // 补码：11111111_11111111_11111111_11111111（原数据）
    // 补码：01111111_11111111_11111111_11111111（右移后）
    // 反码：01111111_11111111_11111111_11111111
    // 原码：01111111_11111111_11111111_11111111
    val ushrBits = bits.ushr(1) // 无符号右移位（Java’s >>>）

    println("bytes is $bits and bytes.toString(2) is ${bits.toString(2)}")
    println("shlBytes is $shlBits and shlBytes.toString(2) is ${shlBits.toString(2)}")
    println("shrBytes is $shrBits and shrBytes.toString(2) is ${shrBits.toString(2)}")
    println("ushrBytes is $ushrBits and ushrBytes.toString(2) is ${ushrBits.toString(2)}")

    // 原、反、补码：00000000_00000000_00000000_10000001
    val leftBits: Int = 0b10000001
    // 原、反、补码：00000000_00000000_00000000_01001011
    val rightBits: Int = 0b01001011
    val andBits = leftBits.and(rightBits) // 与
    val orBits = leftBits.or(rightBits) // 或
    val xorBits = leftBits.xor(rightBits) // 异或
    // 补码：11111111_11111111_11111111_01111110
    // 反码：11111111_11111111_11111111_01111101（补码 -1）
    // 原码：10000000_00000000_00000000_10000010
    var invBits = leftBits.inv() // 非

    println("leftBits is $leftBits and leftBits.toString(2) is ${leftBits.toString(2)}")
    println("rightBits is $rightBits and rightBits.toString(2) is ${rightBits.toString(2)}")
    println("andBits is $andBits and andBits.toString(2) is ${andBits.toString(2)}")
    println("orBits is $orBits and orBits.toString(2) is ${orBits.toString(2)}")
    println("xorBits is $xorBits and xorBits.toString(2) is ${xorBits.toString(2)}")
    println("invBits is $invBits and invBits.toString(2) is ${invBits.toString(2)}")

    val intBits: Int = -2147483648;
    println("intBits is $intBits and invBits.toString(2) is ${intBits.toString(2)}")
}