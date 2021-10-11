package com.lotogram.kotlin

import kotlin.math.roundToInt

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午3:39
 * @Company         LotoGram
 */

fun main() {

    //类型安全的数据转换
    val number1: Int? = "9.8765".toIntOrNull()
    println(number1)

    println(9.23424.toInt())//取整
    println(9.23424.roundToInt())//四舍五入去整

    val number2: String = "%.2f".format(4.2394)//格式化数据
    println(number2)
}