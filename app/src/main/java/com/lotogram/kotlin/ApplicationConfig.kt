package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/13 下午2:34
 * @Company         LotoGram
 */

object ApplicationConfig {

    @JvmStatic
    val s: String = "aaaa"

    init {
        println("ApplicationConfig loading...")
    }

    @JvmStatic
    fun doSomething() {
        println("doSomething")
    }
}

//fun main() {
//    //ApplicationConfig既是类名，又是对象名(是一个单例)
//    ApplicationConfig.doSomething()
//
//}