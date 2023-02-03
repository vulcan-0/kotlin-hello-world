package org.vc121.light.basicsyntax

/**
 * 中缀表示法
 */
fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    println(sophia.likedPerson)
    println(claudia.likedPerson)
}

class Person(val name: String) {
    val likedPerson = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPerson.add(other)
    }
}