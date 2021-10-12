package com.lotogram.kotlin

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/12 上午11:47
 * @Company         LotoGram
 */

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    //创建map
    val map1 = mapOf("Jack" to "1", "Tom" to "2", "Jimmy" to 3)
    val map2 = mapOf(Pair("小亮", 20), Pair("小明", 30), Pair("小红", 40))
    println(map1)
    println(map2)

    //map的取值操作
    println(map1["Jack"])
    println(map1["Tom"])//map1.get("Tom")建议使用第一种
    println(map1.getValue("Jack"))
    println(map1.getOrElse("wu") { "aaaaaaaaaaa" })
    println(map1.getOrDefault("uw", "默认值"))

    //map的遍历1
    for (entry in map1) {
        println("键：${entry.key}  值：${entry.value}")
    }

    //map的遍历2
    map1.forEach { (key, value) ->
        println("键：${key}  值：${value}")
    }

    //map的遍历3
    map1.forEach {
        println("键：${it.key}  值：${it.value}")
    }

    //可变map
    val mutableMap = mutableMapOf("jack" to 50)
    mutableMap["jack"] = 20
    println(mutableMap)

    mutableMap.getOrPut("Rose") { 30 }
    println(mutableMap)

    println(mutableMap.getOrDefault("aaa", 90))

    println(mutableMap.getOrElse("tttttt") { 20000 })
}