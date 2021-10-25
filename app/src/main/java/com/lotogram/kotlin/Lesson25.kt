package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/13 下午4:25
 * @Company         LotoGram
 */

class GamePlayer constructor(val name: String) {

    //嵌套类
    class Equipment constructor(val name: String) {

        fun show() = println("equipment $name")
    }

    fun battle(): Unit {

    }

}

fun main() {
    GamePlayer.Equipment("aa").name
}