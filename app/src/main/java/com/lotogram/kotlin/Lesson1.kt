package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/9 下午4:55
 * @Company         LotoGram
 */

const val MAX = 200

fun main() {
    //只读变量
    val str = "Hello World"
    println(str)

    //普通变量
    var str1 = "Hello World1"
    str1 = "abc"
    println(str1)

    println(getName())

}

fun getName(): String {
    return "邬友亮"
}
 