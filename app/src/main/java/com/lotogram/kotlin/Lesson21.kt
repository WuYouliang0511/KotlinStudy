package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/12 上午10:34
 * @Company         LotoGram
 */

fun main() {
    //安全的取值操作与list一致
    val set1 = setOf("aaa", "aaa", "bbb", "ccc")
    println(set1)

    val set2 = mutableSetOf("111", "111", "222", "333")
    set2 += "444"
    println(set2)

    //利用set集合给list数组去重
    val list1 = listOf("aa", "aa", "bb", "bb", "cc", "cc").toSet().toList()
    println(list1)

    //利用distinct函数给list数组去重,更快捷
    val list2 = listOf("aa", "aa", "bb", "bb", "cc", "cc").distinct()
    println(list2)

}