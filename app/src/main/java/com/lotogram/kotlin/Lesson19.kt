package com.lotogram.kotlin

import java.io.File

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午4:52
 * @Company         LotoGram
 */

fun main() {
    println("start")
    val file = File("/Users/wuyouliang/123.txt").also {
        println(it.name)
    }.also {
        println(it.readText())
    }
    println("end")

    //条件成立则执行，不成立则为null
    val result: String? = file.takeIf { it.exists() && it.canRead() }?.readText()
    println(result)
}