package com.lotogram.kotlin

import java.io.Serializable
import java.util.*

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/12 下午2:19
 * @Company         LotoGram
 */

//第一步：主构造函数声明的属性
//第二步：类级别的属性赋值
//第三步：init初始化代码块
//第四步：次构造函数

fun main() {

    val player = Player("Rose", 100)
    //println(player.name)

}

class Player constructor(
    _name: String,/*临时变量一般会加下划线*/
    /*如果变量前加了val修饰符 ，则该变量是类的成员变量*/ _age: Int?,
    _isNormal: Boolean = false/*默认值*/
) : Serializable {

    //所有的变量默认有get和set，并且是public的
    var name = _name
        get() = "你的名字是$field"
        set(value) {
            field = value.trim()
        }

    var isNormal = _isNormal
        get() {
            return true
        }
        //此方法为私有
        private set(value) {
            name += "$value"
            field = value
        }

    var age = _age
        get() {
            return field?.plus(50)
        }
        //        set(value) {
//            field = value?.plus(20)
//        }
        set(value) = if (value!! > 30) {
            field = 40
        } else {
            field = 90
        }

    lateinit var equipment: String

    val weapon: String by lazy { loadLazy() }

    private fun loadLazy(): String {
        return "aa"
    }

    fun read() {
        equipment = "sharp knife"
    }

    fun battle() {
        println(equipment)
    }

    fun battleWithCheck() {
        if (::equipment.isInitialized) println(equipment)
    }

    constructor(name: String) : this(name, 10)

    constructor(name: String, age: Int?) : this(name, age, true) {
        println("执行次构造方法开始")
        this.name = name.uppercase(Locale.getDefault())
        println("执行次构造方法完成")
    }

    init {
        println("执行初始化块开始")
        require(age!! > 0) { "age must be positive" }
        println("执行初始化块完成")
    }

    override fun toString(): String {
        return "aaaaaaaa"
    }
}
