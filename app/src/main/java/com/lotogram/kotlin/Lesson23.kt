package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/12 上午10:48
 * @Company         LotoGram
 */

fun main() {

    //list集合
    val list: List<String> = listOf("aaa", "bbb", "ccc", "ddd")
    list.forEachIndexed { index, s ->
        println("$index $s")
    }
    println()

    //set集合
    val set: HashSet<String> = hashSetOf("111", "111", "w", "a")
    set.forEachIndexed { index, s ->
        println("$index $s")
    }
    println()

    //数组（相当于java的int[]）
    val array: Array<String> = arrayOf("aa", "bb")
    array.forEach {
        println(it)
    }
    println()

    val arrayList: ArrayList<String> = arrayListOf("aa", "aa", "bb", "cc")
    arrayList.forEachIndexed { index, s ->
        println("$index $s")
    }
}