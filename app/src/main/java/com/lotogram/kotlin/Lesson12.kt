package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午1:59
 * @Company         LotoGram
 */

fun main() {

    val a: String?

    val b: Int? = null



    a = "aa"
    println(a)

    println(a ?: "ddddddd")//三元表达式

    try {
        checkNotNull(b, { println("先决条件，判空") })
        b!!.plus(1);
        println(b)
    } catch (e: Exception) {
        println("空指针")
    }
}