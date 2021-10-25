package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/13 下午3:05
 * @Company         LotoGram
 */

class ConfigMap {

    //只有实例化ConfigMap对象或者，调用load函数，才会实例化伴生对象（节省内存）
    //伴生对象只会有一个（单例），节省内存
    companion object {
        private const val PATH = "aaa";

        fun load() {
            println("aaaaaaa")
        }
    }
}