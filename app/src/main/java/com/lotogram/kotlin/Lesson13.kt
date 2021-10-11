package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/11 下午2:44
 * @Company         LotoGram
 */

const val NAME = "Wu Youliang"

const val NAMES = "A,B,C,D,E"

fun main() {

    val index = NAME.indexOf(" ")
    val sub = NAME.substring(0 until index)
    println(sub)

    val data = NAMES.split(",")
    println(data[0])

    //解构语法(顺序是对应的)
    val (a, b, c, d, e) = NAMES.split(",");
    println(a)
    println(b)
    println(c)

    var country = "The People's Republic of China"
    country = country.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "1"
            "e" -> "1"
            "i" -> "1"
            "o" -> "1"
            "u" -> "1"
            else -> it.value
        }
    }
    println(country)

    "aaa".replace(Regex("")) {
        when (it.value) {
            "a" -> "1"
            "e" -> "1"
            "i" -> "1"
            "o" -> "1"
            "u" -> "1"
            else -> it.value
        }
    }

    var country1 = "The People's Republic of China"
    country1 = country1.replace("a", "c")
    println(country1)

    val str1 = "wuyouliang"
    val str2 = "wuyouliang"
    println(str1 == str2)//比较字符是否匹配
    println(str1 === str2)//比较是否指向同一个引用

    //字符串的遍历
    country1.forEach {
        print("$it ")
    }



}