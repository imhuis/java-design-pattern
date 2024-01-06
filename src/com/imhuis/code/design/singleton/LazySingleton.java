package com.imhuis.code.design.singleton;

/**
 * @author: imhuis
 * @date: 2024/1/6
 * @description:
 */
public class LazySingleton {
    private static volatile LazySingleton uniqueInstance;

    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (LazySingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
