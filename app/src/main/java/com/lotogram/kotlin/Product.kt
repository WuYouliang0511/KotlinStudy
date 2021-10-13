package com.lotogram.kotlin

/**
 * @Author:         Wu Youliang
 * @CreateDate:     2021/10/13 下午2:08
 * @Company         LotoGram
 */

open class Product constructor(val name: String) {

    fun description() = "Product: $name"
    open fun load() = "Nothing..."
}

class LuxuryProduct : Product("Luxury") {

    override fun load() = "LuxuryProduct loading..."

    fun special() = "LuxuryProduct special function..."

}

fun main() {
    val p: Product = LuxuryProduct();
    println(p.description())

    //类型判断
    println(p is LuxuryProduct)
    println(p is Product)

    if (p is LuxuryProduct) {
        println(p.special())
    }
    //p.special()//编译不通过

    //智能类型转换
    println((p as LuxuryProduct).special())
    p.special()//编译通过

}