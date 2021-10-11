package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 上午9:58
 * @Company         LotoGram
 */

// 没有返回类型的函数间作Unit函数
// 等同与Java的void函数
fun main() {
    println(fix())
    println("after nothing")
}

fun fix() {
    println("fix something")
}