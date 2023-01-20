package org.vc121.light.extensions

class User(var name: String)

/**
 * 扩展函数
 **/
fun User.print() {
    print("用户名 $name")
}

fun main(args: Array<String>) {
    var user = User("Runoob")
    user.print()
}