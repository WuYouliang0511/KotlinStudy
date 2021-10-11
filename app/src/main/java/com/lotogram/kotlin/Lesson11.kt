package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 上午11:56
 * @Company         LotoGram
 */


//闭包
fun main() {
    val configDiscountWords = configDiscountWords()
    println(configDiscountWords("沐浴露"))
}

private fun configDiscountWords(): (String) -> String {
    return { goodName: String ->
        val currentYear = 2017
        val hour = (1..24).shuffled().last()
        "${currentYear}年,双11${goodName}促销倒计时：${hour}小时"
    }
}