package com.lotogram.kotlin

import java.io.File


/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午3:49
 * @Company         LotoGram
 */

fun main() {

    //apply关键字的使用
    val file = File("/Users/wuyouliang/123.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(true)
    }

    val a: String = file.readText()
    println(a)
}