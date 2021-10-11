package com.lotogram.kotlin

import java.io.File

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午4:05
 * @Company         LotoGram
 */

fun main() {

    //返回的是lambda表达式最后一行的执行结果
    // 和apply一样，具有隐式调用
    val file = File("/Users/wuyouliang/123.txt")
    val result = file.run {
        readText().contains("1234567890")
        //println()
    }
    println(result)

    //run也可以执行函数引用
    val result2 = "The People's Republic of China".run(::tooLong)
    println(result2)
}


fun tooLong(name: String): Boolean = name.length > 10

fun isLong(name: String): Boolean {
    return name.length > 10
}

fun getAAAA(name: String): String = name + "aaa"