package com.lotogram.kotlin

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/12 上午9:27
 * @Company         LotoGram
 */

@RequiresApi(Build.VERSION_CODES.N)
fun main() {

    val list: List<String> = listOf("aaa", "bbb", "ccc", "ddd")

    //不安全的取值
    println(list[3])

    //安全的取值
    println(list.getOrElse(4) { "aaaaa" })
    println(list.getOrNull(4) ?: "unknown")

    //可变数组
    val list2 = mutableListOf("111", "222", "333", "444")
    list2.add("555")
    list2.remove("111")
    println(list2)

    //可变数组与不可变数组的相互转换
    val a = list.toMutableList();
    val b = list2.toList();
    println(a)
    println(b)

    //mutator函数
    list2 += "666"
    println(list2)

    //基于lambda表达式的删除指定元素（会删除多个元素）
    list2.removeIf { it.contains("111") }

    //集合的遍历1
    for (abc in list2) {
        println("元素:$abc")
    }

    //集合的遍历2
    list2.forEach {
        println(it)
    }

    //集合的遍历3（带有索引）
    list2.forEachIndexed { index, item ->
        println("第${index}个元素是${item}")
    }

    //解构语法过滤元素（下划线不赋值）
    val (var1, var2, var3, _) = list2
    println("var1:$var1")
    println("var2:$var2")
    println("var3:$var3")
    println("_下划线不赋值")

}