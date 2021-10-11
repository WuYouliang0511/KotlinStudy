package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午4:25
 * @Company         LotoGram
 */

fun main() {
    //with和run差不多，传递参数的方式不一样
    val result1 = "The People's Republic of China".run {
        length > 10
    }
    println(result1)

    val result2 = with("The People's Republic of China") {
        length > 10
    }
    println(result2)
}