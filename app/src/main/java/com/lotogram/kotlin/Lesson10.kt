package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 上午11:44
 * @Company         LotoGram
 */

//函数引用
fun main() {
    showOnBoard("洗衣液", ::getDiscountWords)
}

private fun showOnBoard(goodName: String, aaa: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(aaa(goodName, hour))
}

private fun getDiscountWords(goodName: String, hour: Int): String {
    val currentYear = 2027
    return "${currentYear}年,双11${goodName}促销倒计时：${hour}小时"
}
