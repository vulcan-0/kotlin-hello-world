package org.vc121.light.extend

open class Person(var name: String, var age: Int) { // 基类

}

class Student(name: String, age: Int, var no: String, var score: Int) : Person(name, age) {

}

// 测试
fun main(args: Array<String>) {
    val s = Student("Runoob", 18, "S12346", 89)
    println("学生名：${s.name}")
    println("年龄：${s.age}")
    println("学生号：${s.no}")
    println("成绩：${s.score}")
}