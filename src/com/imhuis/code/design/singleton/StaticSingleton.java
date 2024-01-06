package com.imhuis.code.design.singleton;

/**
 * @author: imhuis
 * @date: 2024/1/6
 * @description: 静态内部类单例模式
 */
public class StaticSingleton {

    private StaticSingleton() {}

    private static class Singleton {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return Singleton.INSTANCE;
    }
}
