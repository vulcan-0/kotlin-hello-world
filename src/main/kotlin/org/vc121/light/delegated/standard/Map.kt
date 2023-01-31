package org.vc121.light.delegated.standard

class Site(val map: Map<String, Any?>) {

    val name: String by map
    val url: String by map

}

fun main(args: Array<String>) {
    // 构造函数接受一个映射参数
    val site = Site(
        mapOf(
            "name" to "菜鸟教程",
            "url" to "www.runoob.com"
        )
    )
    // 读取映射值
    println(site.name)
    println(site.url)

    println("--------------")
    // 可变的 Map
    var map: MutableMap<String, Any?> = mutableMapOf(
        "name" to "菜鸟教程",
        "url" to "www.runoob.com"
    )
    val site2 = Site(map)
    println(site2.name)
    println(site2.url)
    println("--------------")
    map.put("name", "Google")
    map.put("url", "www.google.com")
    println(site2.name)
    println(site2.url)
}