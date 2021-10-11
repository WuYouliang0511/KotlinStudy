package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/9 下午5:57
 * @Company         LotoGram
 */

fun main() {
    println(doSomething(age = 34, id = "abc"))
    println(getDescription())
}

//默认是public
private fun doSomething(name: String = "邬友亮", age: Int = 24, id: String): String {
    return "姓名：$name  年龄：$age  ID：$id"
}

fun getDescription(): String {
    return "修饰符"
}