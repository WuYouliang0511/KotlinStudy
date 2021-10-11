package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午3:56
 * @Company         LotoGram
 */


fun main() {

    val result = listOf(3, 2, 1).first().let {
        it * it
    }
    println(result)

    println(formatGreet(null))
}

fun formatGreet(guestName: String?): String {

    return guestName?.let {
        "welcome $guestName"
    } ?: "what is your name"
}