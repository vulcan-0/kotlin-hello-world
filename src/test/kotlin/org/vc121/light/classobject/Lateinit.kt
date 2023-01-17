package org.vc121.light.classobject

import kotlin.test.BeforeTest
import kotlin.test.Test

/**
 * 延迟初始化
 * 一般情况下，属性声明为非空类型必须在构造函数中初始化
 * 可以使用 lateinit，让属性延迟初始化
 */
class Lateinit {

    lateinit var subject: TestSubject

    @BeforeTest
    fun setup() {
        subject = TestSubject()
    }

    @Test
    fun test() {
        subject.method() // 直接解引用
    }

}

class TestSubject {

    fun method() {
        println("call TestSubject#method()")
    }

}