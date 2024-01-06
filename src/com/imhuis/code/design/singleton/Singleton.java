package com.imhuis.code.design.singleton;

/**
 * @author: imhuis
 * @date: 2023/8/9
 * @description:
 */
public class Singleton {

    // 构造器私有化
    private Singleton() {}

//    static {
//        // 静态代码块实现
//        uniqueInstance = new Singleton();
//    }

    // 静态常量实现
    private final static Singleton uniqueInstance = new Singleton();

    public static Singleton getInstance() {
        return uniqueInstance;
    }

}
