package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/9 下午5:48
 * @Company         LotoGram
 */

fun main() {

    val origin = "Jack"
    val destination = "Rose"

    println("$origin loves $destination")

    val flag = false
    println("The answer is ${if (flag) "可以" else "不可以"}")
}