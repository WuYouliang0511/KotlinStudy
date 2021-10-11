package com.lotogram.kotlin;

/**
 * @Author: Wu Youliang
 * @CreateDate: 2021/10/11 上午10:13
 * @Company LotoGram
 */

public class Test {
    public static void is() {

    }

    public static void main(String[] args) {

        String a = "asdfghj";
        String b = "Asdfghj".toLowerCase();
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1 == s2);//比较是否指向同一个引用
        System.out.println(s1.equals(s2));//比较结构
    }
}
