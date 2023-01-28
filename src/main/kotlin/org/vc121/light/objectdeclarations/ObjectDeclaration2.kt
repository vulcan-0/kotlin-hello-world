package org.vc121.light.objectdeclarations

class Site2 {

    var name = "菜鸟教程"

    object DeskTop {

        var url = "www.runoob.com"

        fun showName() {
            // print{"desk legs $name"} // 错误，不能访问到外部类的方法和变量
        }

    }

}

fun main(args: Array<String>) {
    var site = Site2()
    // println(site.DeskTop.url) // 错误，不能通过外部类的实例访问到该对象
    println(Site2.DeskTop.url) // 正确
}