package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/13 上午11:27
 * @Company         LotoGram
 */

fun main() {

    val player = Player("Wu Youliang", 24)
    //延迟初始化
    player.read()
    player.battleWithCheck()

    //惰性初始化
    val player1 = Player("Wu Youliang", 24)
    println(player1.weapon)
}