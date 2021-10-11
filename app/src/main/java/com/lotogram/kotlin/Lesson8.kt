package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 上午10:31
 * @Company         LotoGram
 */

fun main() {
    // 变量的类型是一个匿名函数
    // 匿名函数不需要return关键字来返回数据
    // 匿名函数会自动返回函数题最后一行语句执行的结果
    val blessingFunc: () -> String = {
        val today = "Today is Monday"
        today
    }
    println(blessingFunc())

    //单个参数的匿名函数
    val blessingFunc0: (Int) -> String = {
        "Int is $it "
    }
    println(blessingFunc0(1))

    //多个参数的匿名函数
    val blessingFunc1: (Int, String) -> String = { a, b ->
        "Int is $a  String is $b"
    }
    println(blessingFunc1(1, "abc"))

    //简化的匿名函数（返回类型自动识别）
    val blessingFunc2 = {
        "Int is a  String is b"
    }
    println(blessingFunc2())

    //简化的匿名函数（返回类型自动识别）
    val blessingFunc3 = { a: Int, b: String ->
        "Int is $a  String is $b"
    }
    println(blessingFunc3(1000, "abc"))


}