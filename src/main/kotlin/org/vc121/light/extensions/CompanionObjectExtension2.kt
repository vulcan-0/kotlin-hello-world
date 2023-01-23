package org.vc121.light.extensions

class MyClass2 {

    companion object {

        val myClassField1: Int = 1
        var myClassField2 = "this is myClassField2"

        fun companionFun1() {
            println("this is 1st companion function.")
            foo() // 调用类外扩展的伴随对象函数
        }

        fun companionFun2() {
            println("this is 2st companion function.")
            companionFun1()
        }

    }

    fun MyClass2.Companion.foo() {
        println("伴随对象的扩展函数（内部）")
    }

    fun test2() {
        MyClass2.foo() // 调用类内扩展的伴随对象函数
    }

    init {
        test2()
    }

}

val MyClass2.Companion.no: Int
    get() = 10

fun MyClass2.Companion.foo() {
    println("foo 伴随对象外部扩展函数")
}

/**
 * 对于伴生对象扩展函数，有两种形式，一种是在类内扩展，一种是在类外扩展，
 * 这两种形式扩展后的函数互不影响（甚至名称都可以相同），即使名称相同，
 * 它们也完全是两个不同的函数，并且有以下特点：
 * （1）类内扩展的伴随对象函数和类外扩展的伴随对象可以同名，它们是两个独立的函数，互不影响；
 * （2）当类内扩展的伴随对象函数和类外扩展的伴随对象同名时，类内的其它函数优先引用类内扩展的伴随对象函数，
 * 即对于类内其它成员函数来说，类内扩展屏蔽类外扩展；
 * （3）类内扩展的伴随对象函数只能被类内的函数引用，不能被类外的函数和伴随对象内的函数引用；
 * （4）类外扩展的伴随对象函数可以被伴随对象内的函数引用；
 */
fun main(args: Array<String>) {
    MyClass2()
    println("no: ${MyClass2.no}")
    println("field1: ${MyClass2.myClassField1}")
    println("field2: ${MyClass2.myClassField2}")
    MyClass2.foo() // 调用类外扩展的伴随对象函数
    MyClass2.companionFun2()
}