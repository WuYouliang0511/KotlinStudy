package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 上午10:22
 * @Company         LotoGram
 */

fun main() {
    val total = "My name is Wu Youliang"

    //统计字符串的字符个数
    val count = total.length
    println(count)

    //统计字符串的字符个数
    val count1 = total.count()
    println(count1)

    //统计字符串的'u'的个数
    val count2 = total.count { it == 'u' }
    println(count2)
}