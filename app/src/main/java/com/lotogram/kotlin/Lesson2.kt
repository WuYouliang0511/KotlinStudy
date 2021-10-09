package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/9 下午5:11
 * @Company         LotoGram
 */

fun main() {
    val age = 3

    println(age)

    //范围判断1
//    if (age >= 0 && age <= 3) {
//        println("婴幼儿")
//    } else if (age > 4 && age <= 12) {
//        println("少儿")
//    } else {
//        println("未知")
//    }

    //范围判断2
//    if (age in 0..3) {
//        println("婴幼儿")
//    } else if (age in 3..12) {
//        println("少儿")
//    } else {
//        println("未知")
//    }

    //范围判断3
    when (age) {
        in 0..3 -> {
            println("婴幼儿")
        }
        in 3..12 -> {
            println("少儿")
        }
        else -> {
            println("未知")
        }
    }

    val school = "小学"
    val level: Any? = when (null) {
        "小学" -> "你是小学生"
        "中学" -> "你是中学生"
        "大学" -> "你是大学生"
        else -> null
    }

    level?.let {
        println(level)
    }
}
 