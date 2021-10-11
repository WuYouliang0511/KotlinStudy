package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 上午11:15
 * @Company         LotoGram
 */

fun main() {

    val getDiscountWords = { goodName: String, hour: Int ->
        val currentYear = 2027
        "${currentYear}年,双11${goodName}促销倒计时：${hour}小时"
    }
    showOnBoard("洗衣液", getDiscountWords)

    //简略写法
    //当lambda表达式是唯一一个参数，或者左后一个参数
    showOnBoard("牙膏") { goodName: String, hour: Int ->
        val currentYear = 2027
        "${currentYear}年,双11${goodName}促销倒计时：${hour}小时"
    }


}

private fun showOnBoard(goodName: String, aaa: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(aaa(goodName, hour))
}